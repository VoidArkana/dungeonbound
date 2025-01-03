package com.orca.dungeonbound.client.model;// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.orca.dungeonbound.client.animations.KoboldAnimations;
import com.orca.dungeonbound.common.entity.custom.KoboldEntity;
import net.minecraft.client.animation.definitions.CamelAnimation;
import net.minecraft.client.model.ArmedModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.HumanoidArm;
import org.joml.Quaternionf;

public class KoboldModel<T extends KoboldEntity> extends HierarchicalModel<T> implements ArmedModel {

	private final ModelPart root;
	private final ModelPart kobold;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart earLeft;
	private final ModelPart earRight;
	private final ModelPart tail;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;

	public KoboldModel(ModelPart root) {
		this.root = root.getChild("root");
		this.kobold = this.root.getChild("kobold");
		this.body = this.kobold.getChild("body");
		this.head = this.body.getChild("head");
		this.earLeft = this.head.getChild("earLeft");
		this.earRight = this.head.getChild("earRight");
		this.tail = this.body.getChild("tail");
		this.LeftArm = body.getChild("LeftArm");
		this.RightArm = body.getChild("RightArm");
		this.LeftLeg = this.kobold.getChild("LeftLeg");
		this.RightLeg = this.kobold.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition kobold = root.addOrReplaceChild("kobold", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = kobold.addOrReplaceChild("body", CubeListBuilder.create().texOffs(56, 48).addBox(-2.5F, -4.0F, -2.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 62).addBox(-1.5F, -9.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(28, 48).addBox(-2.5F, -1.5F, -8.0F, 5.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(29, 64).addBox(1.5F, -2.5F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(29, 64).addBox(-2.5F, -2.5F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(28, 65).addBox(-2.5F, -2.5F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 65).addBox(1.5F, -2.5F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 70).addBox(-2.5F, 1.5F, -8.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.5F, 0.0F));

		head.addOrReplaceChild("earLeft", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, 0.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 0.0F, 0.0F));

		head.addOrReplaceChild("earRight", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-4.0F, -0.5F, 0.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.5F, 0.0F, 0.0F));

		body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 48).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, -3).addBox(0.0F, -2.0F, 3.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 2.0F));

		body.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(28, 60).addBox(0.0F, 0.0F, -1.5F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, -4.0F, 0.5F));

		body.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(28, 60).mirror().addBox(-6.0F, 0.0F, -1.5F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.5F, -4.0F, 0.5F));

		kobold.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(38, 63).addBox(-0.9F, -1.0F, -1.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 3).addBox(-0.9F, 3.0F, 0.9F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(-2, 6).mirror().addBox(-1.9F, 5.95F, -1.1F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -6.0F, 1.0F));

		kobold.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(38, 63).mirror().addBox(-1.1F, -1.0F, -1.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 3).addBox(-0.1F, 3.0F, 0.9F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(-2, 6).addBox(-0.9F, 5.95F, -1.1F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -6.0F, 1.0F));

		return LayerDefinition.create(meshdefinition, 80, 80);
	}

	@Override
	public void setupAnim(KoboldEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.head.xRot = headPitch * ((float)Math.PI / 180F);
		this.head.yRot = netHeadYaw * ((float)Math.PI / 180F);

		this.animateWalk(KoboldAnimations.WALK, limbSwing, limbSwingAmount, 2.0F, 2.5F);

		this.animate(entity.idleAnimationState, KoboldAnimations.IDLE, ageInTicks, 1.0F);

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return root;
	}

	@Override
	public void translateToHand(HumanoidArm pSide, PoseStack pPoseStack) {
		//this.getArm(pSide).translateAndRotate(pPoseStack);

		boolean flag = pSide == HumanoidArm.RIGHT;
		ModelPart modelpart = flag ? this.RightArm : this.LeftArm;
		this.root.translateAndRotate(pPoseStack);
		this.kobold.translateAndRotate(pPoseStack);
		this.body.translateAndRotate(pPoseStack);
		modelpart.translateAndRotate(pPoseStack);
		pPoseStack.scale(0.55F, 0.55F, 0.55F);
		this.offsetStackPosition(pPoseStack, flag);
	}

	private ModelPart getArm(HumanoidArm pArm) {
		return pArm == HumanoidArm.LEFT ? this.LeftArm : this.RightArm;
	}

	private void offsetStackPosition(PoseStack pPoseStack, boolean pRightSide) {
		if (pRightSide) {
			pPoseStack.translate(-0.5D, -0.5D, 0.078125D);
		} else {
			pPoseStack.translate(0.5D, -0.5D, 0.078125D);
		}

	}
}