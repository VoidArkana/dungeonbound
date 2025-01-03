package com.orca.dungeonbound.common.entity.custom;

import com.orca.dungeonbound.util.DBTags;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.*;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import org.jetbrains.annotations.Nullable;

import java.util.function.Predicate;

public class KoboldEntity extends TamableAnimal {

    protected static final EntityDataAccessor<Integer> HIRED_TIME = SynchedEntityData.defineId(KoboldEntity.class, EntityDataSerializers.INT);

    int prevHiredTime;

    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public final Predicate<LivingEntity> KOBOLD_TARGET = (livingEntity) -> {
        return (livingEntity instanceof Monster || livingEntity.getType().is(DBTags.EntityTypes.KOBOLD_ATTACK_TARGETS));
    };

    public KoboldEntity(EntityType<? extends TamableAnimal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    //attributes
    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 10.0)
                .add(Attributes.MOVEMENT_SPEED, 0.4)
                .add(Attributes.ATTACK_DAMAGE, 2D);
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(3, new KoboldEntity.KoboldAvoidGoal<>(this, Monster.class, 10.0F, 1.0D, 1.2D));
        this.goalSelector.addGoal(1, new KoboldEntity.KoboldPanicGoal(this, 1.4D));
        this.goalSelector.addGoal(4, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(6, new FollowOwnerGoal(this, 1.0D, 10.0F, 2.0F, false));
        this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(6, new MeleeAttackGoal(this, (double)1.2F, true));
        this.targetSelector.addGoal(3, (new HurtByTargetGoal(this)).setAlertOthers());
        //todo: test these 2
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<>(this, LivingEntity.class, 20, false, false, (entity) -> {
            return entity instanceof Monster || entity.getType().is(DBTags.EntityTypes.KOBOLD_ATTACK_TARGETS);
        }));
        this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));

    }

    @Override
    public boolean canAttack(LivingEntity pTarget) {
        return (this.isTame() || this.getGroupSize() > 3) && !this.isAlliedTo(pTarget) && super.canAttack(pTarget);
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(HIRED_TIME,0);
    }

    public void addAdditionalSaveData(CompoundTag pCompound) {
        super.addAdditionalSaveData(pCompound);
        pCompound.putInt("HiredTime", this.getHiredTime());
    }

    public void readAdditionalSaveData(CompoundTag pCompound) {
        super.readAdditionalSaveData(pCompound);
        this.setHiredTime(pCompound.getInt("HiredTime"));
    }

    void setHiredTime(int time){
        this.entityData.set(HIRED_TIME, time);
    }

    int getHiredTime (){
       return this.entityData.get(HIRED_TIME);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) {
        return null;
    }


    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = 19;//this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
        }
    }

    @Override
    protected void updateWalkAnimation(float pPartialTick) {
        float f;
        if(this.getPose() == Pose.STANDING) {
            f = Math.min(pPartialTick * 6F, 1f);
        } else {
            f = 0f;
        }

        this.walkAnimation.update(f, 0.2f);
    }

    @Override
    public void tick() {
        super.tick();

        if (this.getHiredTime()>0){
            prevHiredTime = this.getHiredTime();
            this.setHiredTime(prevHiredTime-1);
        }else if (this.isTame()){
            this.unhire();
        }

        if (this.level().isClientSide()) {
            this.setupAnimationStates();
        }
    }

    public void hire(Player pPlayer) {
        this.setTame(true);
        this.setOwnerUUID(pPlayer.getUUID());
        this.setHiredTime(5*20*60);
    }

    @Override
    public InteractionResult mobInteract(Player pPlayer, InteractionHand pHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pHand);

        if (itemstack.is(Items.GOLD_INGOT) && !this.isTame()) {
            this.usePlayerItem(pPlayer, pHand, itemstack);
            if (this.random.nextInt(3) == 0) {
                this.hire(pPlayer);
                this.playSound(SoundEvents.PLAYER_LEVELUP);
                for(int i = 0; i < 5; ++i) {
                    double d0 = this.random.nextGaussian() * 0.02D;
                    double d1 = this.random.nextGaussian() * 0.02D;
                    double d2 = this.random.nextGaussian() * 0.02D;
                    this.level().addParticle(ParticleTypes.HAPPY_VILLAGER, this.getRandomX(1.0D), this.getRandomY() + 0.5D, this.getRandomZ(1.0D), d0, d1, d2);
                }
            } else {
                this.level().broadcastEntityEvent(this, (byte)6);
            }

            this.setPersistenceRequired();
            return InteractionResult.CONSUME;
        }else if (this.isTame() && itemstack.is(Items.COAL) && this.getOwnerUUID() == pPlayer.getUUID()){
            this.usePlayerItem(pPlayer, pHand, itemstack);
            this.unhire();
            this.playSound(SoundEvents.VILLAGER_NO);
            for(int i = 0; i < 5; ++i) {
                double d0 = this.random.nextGaussian() * 0.02D;
                double d1 = this.random.nextGaussian() * 0.02D;
                double d2 = this.random.nextGaussian() * 0.02D;
                this.level().addParticle(ParticleTypes.ANGRY_VILLAGER, this.getRandomX(1.0D), this.getRandomY() + 0.5D, this.getRandomZ(1.0D), d0, d1, d2);
            }
        }

        return super.mobInteract(pPlayer, pHand);
    }

    public void unhire() {
        this.setTame(false);
        this.setOwnerUUID(null);
        this.setHiredTime(0);
    }

    public int getMaxHeadYRot() {
        return 30;
    }

    public int getGroupSize(){
        int count = 0;
        for (KoboldEntity living : this.level().getEntitiesOfClass(KoboldEntity.class, this.getBoundingBox().inflate(10.0D, 5.0D, 10.0D))) {
            count++;
        }
        return count;
    }

    class KoboldPanicGoal extends PanicGoal {
        KoboldEntity kobold;
        public KoboldPanicGoal(KoboldEntity pMob, double pSpeedModifier) {
            super(pMob, pSpeedModifier);
            kobold = pMob;
        }

        protected boolean shouldPanic() {
            if (kobold.isTame()){
                return this.mob.isFreezing() || this.mob.isOnFire();
            }else {
                return kobold.getGroupSize() < 4 && super.shouldPanic();
            }
        }
    }

    class KoboldAvoidGoal<T extends LivingEntity> extends AvoidEntityGoal<T>{

        private final KoboldEntity kobold;

        public KoboldAvoidGoal(KoboldEntity pKobold, Class<T> pEntityClassToAvoid, float pMaxDist, double pWalkSpeedModifier, double pSprintSpeedModifier) {
            super(pKobold, pEntityClassToAvoid, pMaxDist, pWalkSpeedModifier, pSprintSpeedModifier, EntitySelector.NO_SPECTATORS::test);
            this.kobold = pKobold;
        }

        public boolean canUse() {
            if (super.canUse()){
                return !this.kobold.isTame() && this.kobold.getGroupSize() < 4;
            }else {
                return false;
            }
        }

        public void start() {
            KoboldEntity.this.setTarget((LivingEntity)null);
            super.start();
        }

        public void tick() {
            KoboldEntity.this.setTarget((LivingEntity)null);
            super.tick();
        }
    }

    @javax.annotation.Nullable
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor pLevel, DifficultyInstance pDifficulty, MobSpawnType pReason, @javax.annotation.Nullable SpawnGroupData pSpawnData, @javax.annotation.Nullable CompoundTag pDataTag) {
        RandomSource randomsource = pLevel.getRandom();
        this.populateDefaultEquipmentSlots(randomsource, pDifficulty);
        this.populateDefaultEquipmentEnchantments(randomsource, pDifficulty);
        return super.finalizeSpawn(pLevel, pDifficulty, pReason, pSpawnData, pDataTag);
    }

    protected void populateDefaultEquipmentSlots(RandomSource pRandom, DifficultyInstance pDifficulty) {
        if (this.random.nextBoolean())
            this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.IRON_SWORD));
        else
            this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.IRON_PICKAXE));

        this.setDropChance(EquipmentSlot.MAINHAND, 0.0F);
    }

}
