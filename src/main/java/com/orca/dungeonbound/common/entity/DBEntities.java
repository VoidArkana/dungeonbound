package com.orca.dungeonbound.common.entity;

import com.orca.dungeonbound.DungeonBound;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DBEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DungeonBound.MODID);

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
