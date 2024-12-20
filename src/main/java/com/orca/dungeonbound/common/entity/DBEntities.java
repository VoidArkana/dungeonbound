package com.orca.dungeonbound.common.entity;

import com.orca.dungeonbound.DungeonBound;
import com.orca.dungeonbound.common.entity.custom.KoboldEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DBEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DungeonBound.MODID);

    public static final RegistryObject<EntityType<KoboldEntity>> KOBOLD =
            ENTITY_TYPES.register("kobold", () -> EntityType.Builder.of(KoboldEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 1.2f).build("kobold"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
