package com.orca.dungeonbound.util;

import com.orca.dungeonbound.DungeonBound;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;

public class DBTags {

    public static class EntityTypes {
        public static final TagKey<EntityType<?>> KOBOLD_ATTACK_TARGETS = tag("kobold_attack_targets");
        public static final TagKey<EntityType<?>> KOBOLD_AVOID_TARGETS = tag("kobold_avoid_targets");

        private static TagKey<EntityType<?>> tag(String name){
            return TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation(DungeonBound.MODID, name));
        }
    }

}
