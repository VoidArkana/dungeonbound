package com.orca.dungeonbound.client.animations;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class KoboldAnimations {

    public static final AnimationDefinition WALK = AnimationDefinition.Builder.withLength(1f).looping()
            .addAnimation("kobold",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, -0.43f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.08343333f, KeyframeAnimations.posVec(0f, -0.74f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.16766666f, KeyframeAnimations.posVec(0f, 1.69f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.posVec(0f, 4.43f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.3433333f, KeyframeAnimations.posVec(0f, 4.74f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.41676663f, KeyframeAnimations.posVec(0f, 2.31f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.49999999999999994f, KeyframeAnimations.posVec(0f, -0.43f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5834333f, KeyframeAnimations.posVec(0f, -0.74f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.6766666f, KeyframeAnimations.posVec(0f, 1.69f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.posVec(0f, 4.43f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.8343334f, KeyframeAnimations.posVec(0f, 4.74f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.9167667f, KeyframeAnimations.posVec(0f, 2.31f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.posVec(0f, -0.43f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("kobold",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-8.09f, -45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(1.05f, -45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(9.14f, -45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(8.09f, -45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(-1.05f, -45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.41676663f, KeyframeAnimations.degreeVec(-9.14f, -45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.49999999999999994f, KeyframeAnimations.degreeVec(-8.09f, -45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5834333f, KeyframeAnimations.degreeVec(1.05f, -45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.6766666f, KeyframeAnimations.degreeVec(9.14f, -45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(8.09f, -45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(-1.05f, -45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.9167667f, KeyframeAnimations.degreeVec(-9.14f, -45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(-8.09f, -45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("head",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 40f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("earLeft",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -48.09f, -3.09f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(0f, -38.31f, 6.69f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(0f, -35.22f, 9.78f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(0f, -41.91f, 3.09f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(0f, -51.69f, -6.69f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.41676663f, KeyframeAnimations.degreeVec(0f, -54.78f, -9.78f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.49999999999999994f, KeyframeAnimations.degreeVec(0f, -48.09f, -3.09f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5834333f, KeyframeAnimations.degreeVec(0f, -38.31f, 6.69f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.6766666f, KeyframeAnimations.degreeVec(0f, -35.22f, 9.78f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(0f, -41.91f, 3.09f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(0f, -51.69f, -6.69f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.9167667f, KeyframeAnimations.degreeVec(0f, -54.78f, -9.78f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, -48.09f, -3.09f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("earRight",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 48.09f, -3.09f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(0f, 38.31f, 6.69f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(0f, 35.22f, 9.78f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(0f, 41.91f, 3.09f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(0f, 51.69f, -6.69f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.41676663f, KeyframeAnimations.degreeVec(0f, 54.78f, -9.78f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.49999999999999994f, KeyframeAnimations.degreeVec(0f, 48.09f, -3.09f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5834333f, KeyframeAnimations.degreeVec(0f, 38.31f, 6.69f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.6766666f, KeyframeAnimations.degreeVec(0f, 35.22f, 9.78f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(0f, 41.91f, 3.09f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(0f, 51.69f, -6.69f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.9167667f, KeyframeAnimations.degreeVec(0f, 54.78f, -9.78f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 48.09f, -3.09f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("tail",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-9.27f, 45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(20.07f, 45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(29.34f, 45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(9.27f, 45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(-20.07f, 45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.41676663f, KeyframeAnimations.degreeVec(-29.34f, 45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.49999999999999994f, KeyframeAnimations.degreeVec(-9.27f, 45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5834333f, KeyframeAnimations.degreeVec(20.07f, 45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.6766666f, KeyframeAnimations.degreeVec(29.34f, 45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(9.27f, 45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(-20.07f, 45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.9167667f, KeyframeAnimations.degreeVec(-29.34f, 45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(-9.27f, 45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("LeftArm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -50f, -13.82f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(0f, -50f, -11.73f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(0f, -50f, -27.91f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(0f, -50f, -46.18f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(0f, -50f, -48.27f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.41676663f, KeyframeAnimations.degreeVec(0f, -50f, -32.09f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.49999999999999994f, KeyframeAnimations.degreeVec(0f, -50f, -13.82f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5834333f, KeyframeAnimations.degreeVec(0f, -50f, -11.73f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.6766666f, KeyframeAnimations.degreeVec(0f, -50f, -27.91f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(0f, -50f, -46.18f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(0f, -50f, -48.27f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.9167667f, KeyframeAnimations.degreeVec(0f, -50f, -32.09f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, -50f, -13.82f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("RightArm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 50f, 13.82f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(0f, 50f, 11.73f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(0f, 50f, 27.91f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(0f, 50f, 46.18f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(0f, 50f, 48.27f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.41676663f, KeyframeAnimations.degreeVec(0f, 50f, 32.09f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.49999999999999994f, KeyframeAnimations.degreeVec(0f, 50f, 13.82f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5834333f, KeyframeAnimations.degreeVec(0f, 50f, 11.73f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.6766666f, KeyframeAnimations.degreeVec(0f, 50f, 27.91f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(0f, 50f, 46.18f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(0f, 50f, 48.27f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.9167667f, KeyframeAnimations.degreeVec(0f, 50f, 32.09f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 50f, 13.82f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("LeftLeg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-32.36f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(-36.54f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(-4.18f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(32.36f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(36.54f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.41676663f, KeyframeAnimations.degreeVec(4.18f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.49999999999999994f, KeyframeAnimations.degreeVec(-32.36f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5834333f, KeyframeAnimations.degreeVec(-36.54f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.6766666f, KeyframeAnimations.degreeVec(-4.18f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(32.36f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(36.54f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.9167667f, KeyframeAnimations.degreeVec(4.18f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(-32.36f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("RightLeg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-32.36f, 40f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(4.18f, 40f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(36.54f, 40f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(32.36f, 40f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(-4.18f, 40f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.41676663f, KeyframeAnimations.degreeVec(-36.54f, 40f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.49999999999999994f, KeyframeAnimations.degreeVec(-32.36f, 40f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5834333f, KeyframeAnimations.degreeVec(4.18f, 40f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.6766666f, KeyframeAnimations.degreeVec(36.54f, 40f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(32.36f, 40f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(-4.18f, 40f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.9167667f, KeyframeAnimations.degreeVec(-36.54f, 40f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(-32.36f, 40f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM))).build();

    public static final AnimationDefinition IDLE = AnimationDefinition.Builder.withLength(1f).looping()
            .addAnimation("head",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("earLeft",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -45f, -8f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(0f, -45f, -6.93f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(0f, -45f, -4f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(0f, -45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(0f, -45f, 4f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.41676663f, KeyframeAnimations.degreeVec(0f, -45f, 6.93f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.49999999999999994f, KeyframeAnimations.degreeVec(0f, -45f, 8f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5834333f, KeyframeAnimations.degreeVec(0f, -45f, 6.93f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.6766666f, KeyframeAnimations.degreeVec(0f, -45f, 4f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(0f, -45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(0f, -45f, -4f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.9167667f, KeyframeAnimations.degreeVec(0f, -45f, -6.93f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, -45f, -8f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("earRight",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 45f, 8f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(0f, 45f, 6.93f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(0f, 45f, 4f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(0f, 45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(0f, 45f, -4f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.41676663f, KeyframeAnimations.degreeVec(0f, 45f, -6.93f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.49999999999999994f, KeyframeAnimations.degreeVec(0f, 45f, -8f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5834333f, KeyframeAnimations.degreeVec(0f, 45f, -6.93f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.6766666f, KeyframeAnimations.degreeVec(0f, 45f, -4f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(0f, 45f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(0f, 45f, 4f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.9167667f, KeyframeAnimations.degreeVec(0f, 45f, 6.93f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 45f, 8f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("tail",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-9.34f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(-8.04f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(-8.61f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-10.89f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(-14.27f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.41676663f, KeyframeAnimations.degreeVec(-17.85f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.49999999999999994f, KeyframeAnimations.degreeVec(-20.66f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5834333f, KeyframeAnimations.degreeVec(-21.96f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.6766666f, KeyframeAnimations.degreeVec(-21.39f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(-19.11f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(-15.73f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.9167667f, KeyframeAnimations.degreeVec(-12.15f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(-9.34f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("LeftArm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 60f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("RightArm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, -60f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("body",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0.15f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.08343333f, KeyframeAnimations.posVec(0f, -0.1f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.16766666f, KeyframeAnimations.posVec(0f, -0.33f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.posVec(0f, -0.48f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.3433333f, KeyframeAnimations.posVec(0f, -0.49f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.41676663f, KeyframeAnimations.posVec(0f, -0.37f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.49999999999999994f, KeyframeAnimations.posVec(0f, -0.15f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5834333f, KeyframeAnimations.posVec(0f, 0.1f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.6766666f, KeyframeAnimations.posVec(0f, 0.33f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.posVec(0f, 0.48f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.8343334f, KeyframeAnimations.posVec(0f, 0.49f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.9167667f, KeyframeAnimations.posVec(0f, 0.37f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.posVec(0f, 0.15f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("body",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0.31f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(0.74f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(0.98f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(0.95f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(0.67f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.41676663f, KeyframeAnimations.degreeVec(0.21f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.49999999999999994f, KeyframeAnimations.degreeVec(-0.31f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.5834333f, KeyframeAnimations.degreeVec(-0.74f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.6766666f, KeyframeAnimations.degreeVec(-0.98f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(-0.95f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(-0.67f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.9167667f, KeyframeAnimations.degreeVec(-0.21f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0.31f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM))).build();
}
