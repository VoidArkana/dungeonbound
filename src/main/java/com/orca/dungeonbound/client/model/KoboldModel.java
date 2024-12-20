package com.orca.dungeonbound.client.model;// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.orca.dungeonbound.common.entity.custom.KoboldEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class KoboldModel<T extends KoboldEntity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "dungeonkobold"), "main");
	private final ModelPart root;
	private final ModelPart barrel;
	private final ModelPart lid;
	private final ModelPart kobold2;
	private final ModelPart body2;
	private final ModelPart head2;
	private final ModelPart earLeft2;
	private final ModelPart earRight2;
	private final ModelPart tail2;
	private final ModelPart LeftArm2;
	private final ModelPart RightArm2;
	private final ModelPart LeftLeg2;
	private final ModelPart RightLeg2;
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
		this.barrel = this.root.getChild("barrel");
		this.lid = this.barrel.getChild("lid");
		this.kobold2 = this.barrel.getChild("kobold2");
		this.body2 = this.kobold2.getChild("body2");
		this.head2 = this.body2.getChild("head2");
		this.earLeft2 = this.head2.getChild("earLeft2");
		this.earRight2 = this.head2.getChild("earRight2");
		this.tail2 = this.body2.getChild("tail2");
		this.LeftArm2 = this.body2.getChild("LeftArm2");
		this.RightArm2 = this.body2.getChild("RightArm2");
		this.LeftLeg2 = this.kobold2.getChild("LeftLeg2");
		this.RightLeg2 = this.kobold2.getChild("RightLeg2");
		this.kobold = this.root.getChild("kobold");
		this.body = this.kobold.getChild("body");
		this.head = this.body.getChild("head");
		this.earLeft = this.head.getChild("earLeft");
		this.earRight = this.head.getChild("earRight");
		this.tail = this.body.getChild("tail");
		this.LeftArm = this.body.getChild("LeftArm");
		this.RightArm = this.body.getChild("RightArm");
		this.LeftLeg = this.kobold.getChild("LeftLeg");
		this.RightLeg = this.kobold.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition barrel = root.addOrReplaceChild("barrel", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -15.0F, -8.0F, 16.0F, 15.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lid = barrel.addOrReplaceChild("lid", CubeListBuilder.create().texOffs(0, 31).addBox(-8.0F, -1.1F, -8.0F, 16.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -19.0F, 0.0F));

		PartDefinition kobold2 = barrel.addOrReplaceChild("kobold2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body2 = kobold2.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(56, 48).addBox(-2.5F, -4.0F, -2.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 62).addBox(-1.5F, -9.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.0F, 0.0F));

		PartDefinition head2 = body2.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(28, 48).addBox(-2.5F, -1.5F, -8.0F, 5.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(29, 64).addBox(1.5F, -2.5F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(29, 64).addBox(-2.5F, -2.5F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(28, 65).addBox(-2.5F, -2.5F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 65).addBox(1.5F, -2.5F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 70).addBox(-2.5F, 1.5F, -8.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.5F, 0.0F));

		PartDefinition earLeft2 = head2.addOrReplaceChild("earLeft2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, 0.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 0.0F, 0.0F));

		PartDefinition earRight2 = head2.addOrReplaceChild("earRight2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-4.0F, -0.5F, 0.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.5F, 0.0F, 0.0F));

		PartDefinition tail2 = body2.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 48).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, -3).addBox(0.0F, -2.0F, 3.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 2.0F));

		PartDefinition LeftArm2 = body2.addOrReplaceChild("LeftArm2", CubeListBuilder.create().texOffs(28, 60).addBox(0.0F, 0.0F, -1.5F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, -4.0F, 0.5F));

		PartDefinition RightArm2 = body2.addOrReplaceChild("RightArm2", CubeListBuilder.create().texOffs(28, 60).mirror().addBox(-6.0F, 0.0F, -1.5F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.5F, -4.0F, 0.5F));

		PartDefinition LeftLeg2 = kobold2.addOrReplaceChild("LeftLeg2", CubeListBuilder.create().texOffs(38, 63).addBox(-0.9F, -1.0F, -1.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 3).addBox(-0.9F, 3.0F, 0.9F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(-2, 6).addBox(-1.9F, 5.95F, -1.1F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -6.0F, 1.0F));

		PartDefinition RightLeg2 = kobold2.addOrReplaceChild("RightLeg2", CubeListBuilder.create().texOffs(38, 63).mirror().addBox(-1.1F, -1.0F, -1.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 3).addBox(-0.1F, 3.0F, 0.9F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(-2, 6).addBox(-0.9F, 5.95F, -1.1F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -6.0F, 1.0F));

		PartDefinition kobold = root.addOrReplaceChild("kobold", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = kobold.addOrReplaceChild("body", CubeListBuilder.create().texOffs(56, 48).addBox(-2.5F, -4.0F, -2.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 62).addBox(-1.5F, -9.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(28, 48).addBox(-2.5F, -1.5F, -8.0F, 5.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(29, 64).addBox(1.5F, -2.5F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(29, 64).addBox(-2.5F, -2.5F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(28, 65).addBox(-2.5F, -2.5F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 65).addBox(1.5F, -2.5F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 70).addBox(-2.5F, 1.5F, -8.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.5F, 0.0F));

		PartDefinition earLeft = head.addOrReplaceChild("earLeft", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, 0.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 0.0F, 0.0F));

		PartDefinition earRight = head.addOrReplaceChild("earRight", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-4.0F, -0.5F, 0.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.5F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 48).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, -3).addBox(0.0F, -2.0F, 3.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 2.0F));

		PartDefinition LeftArm = body.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(28, 60).addBox(0.0F, 0.0F, -1.5F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, -4.0F, 0.5F));

		PartDefinition RightArm = body.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(28, 60).mirror().addBox(-6.0F, 0.0F, -1.5F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.5F, -4.0F, 0.5F));

		PartDefinition LeftLeg = kobold.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(38, 63).addBox(-0.9F, -1.0F, -1.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 3).addBox(-0.9F, 3.0F, 0.9F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(-2, 6).mirror().addBox(-1.9F, 5.95F, -1.1F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, -6.0F, 1.0F));

		PartDefinition RightLeg = kobold.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(38, 63).mirror().addBox(-1.1F, -1.0F, -1.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 3).addBox(-0.1F, 3.0F, 0.9F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(-2, 6).addBox(-0.9F, 5.95F, -1.1F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -6.0F, 1.0F));

		return LayerDefinition.create(meshdefinition, 80, 80);
	}

	@Override
	public void setupAnim(KoboldEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.head.xRot = headPitch * ((float)Math.PI / 180F);
		this.head.yRot = netHeadYaw * ((float)Math.PI / 180F);
		this.barrel.visible = false;

		float animQueryTime = ageInTicks/2;

		if (entity.walkAnimation.isMoving()){
			this.RightLeg.xRot = (float) ((Math.cos((limbSwing-0.2)*720)*40))*limbSwingAmount;
			this.RightLeg.yRot = 40*limbSwingAmount;
			this.LeftLeg.xRot = (float) ((Math.cos((limbSwing-0.3)*720)*40))*limbSwingAmount;
			this.RightArm.zRot = (float) ((Math.cos((limbSwing-0.3)*720)*20+30))*limbSwingAmount;
			this.RightArm.yRot = 50*limbSwingAmount;
			this.LeftArm.zRot = (float) ((Math.cos((limbSwing-0.3)*720)*-20+30))*limbSwingAmount;
			this.LeftArm.yRot = -50*limbSwingAmount;
			this.tail.xRot = (float) ((Math.cos((limbSwing-0.4)*720)*-30))*limbSwingAmount;
			this.tail.yRot = 45*limbSwingAmount;
			this.earRight.yRot = (float) ((Math.cos((limbSwing-0.4)*720)*10+45)*limbSwingAmount);
			this.earRight.zRot = (float) (Math.cos((limbSwing-0.4)*720)*-10)*limbSwingAmount;
        }else {

		}

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return root;
	}
}