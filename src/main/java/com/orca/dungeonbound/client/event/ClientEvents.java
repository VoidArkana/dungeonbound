package com.orca.dungeonbound.client.event;

import com.orca.dungeonbound.DungeonBound;
import com.orca.dungeonbound.client.model.KoboldModel;
import com.orca.dungeonbound.client.model.ModelLayers;
import com.orca.dungeonbound.client.renderer.KoboldRenderer;
import com.orca.dungeonbound.common.entity.DBEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = DungeonBound.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModelLayers.KOBOLD_LAYER, KoboldModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerRenderer(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(DBEntities.KOBOLD.get(), KoboldRenderer::new);
    }
}
