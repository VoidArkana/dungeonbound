package com.orca.dungeonbound.client.renderer;

import com.orca.dungeonbound.DungeonBound;
import com.orca.dungeonbound.client.model.KoboldModel;
import com.orca.dungeonbound.client.model.ModelLayers;
import com.orca.dungeonbound.common.entity.custom.KoboldEntity;
import net.minecraft.client.model.SnifferModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.sniffer.Sniffer;

public class KoboldRenderer extends MobRenderer<KoboldEntity, KoboldModel<KoboldEntity>> {

    private static final ResourceLocation KOBOLD_LOCATION = new ResourceLocation(DungeonBound.MODID,"textures/entity/kobold.png");

    public KoboldRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new KoboldModel<>(pContext.bakeLayer(ModelLayers.KOBOLD_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(KoboldEntity pEntity) {
        return KOBOLD_LOCATION;
    }
}
