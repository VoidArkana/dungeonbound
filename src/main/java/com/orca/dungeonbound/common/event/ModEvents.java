package com.orca.dungeonbound.common.event;

import com.orca.dungeonbound.DungeonBound;
import com.orca.dungeonbound.common.entity.DBEntities;
import com.orca.dungeonbound.common.entity.custom.KoboldEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DungeonBound.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(DBEntities.KOBOLD.get(), KoboldEntity.createAttributes().build());
    }
}
