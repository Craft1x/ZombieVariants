package com.zv.entity.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.render.entity.model.ZombieEntityModel;
import net.minecraft.entity.mob.ZombieEntity;

@Environment(EnvType.CLIENT)
public class LushZombieEntityModel<T extends ZombieEntity> extends ZombieEntityModel<T> {
    public LushZombieEntityModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();

        // HEAD
        ModelPartData head = modelPartData.addChild(
                EntityModelPartNames.HEAD,
                ModelPartBuilder.create()
                        .uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F)
                        .uv(1, 34).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.25F)),
                ModelTransform.pivot(0.0F, 0.0F, 0.0F)
        );

        ModelPartData brow1 = head.addChild("brow1", ModelPartBuilder.create(), ModelTransform.pivot(2.25F, -5.0F, -4.2F));
        brow1.addChild("brow1_r1",
                ModelPartBuilder.create().uv(0, 34).cuboid(-2.0F, -1.5F, 0.0F, 4.0F, 2.0F, 0.0F),
                ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F)
        );

        ModelPartData brow2 = head.addChild("brow2", ModelPartBuilder.create(), ModelTransform.pivot(-2.25F, -5.0F, -4.2F));
        brow2.addChild("brow2_r1",
                ModelPartBuilder.create().uv(0, 34).mirrored().cuboid(-2.0F, -1.5F, 0.0F, 4.0F, 2.0F, 0.0F),
                ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F)
        );

        // Invisible HAT bone
        modelPartData.addChild(
                EntityModelPartNames.HAT,
                ModelPartBuilder.create(), // No visible geometry
                ModelTransform.of(0.0F, -8.0F, 0.0F, 0, 0, 0)
        );

        // BODY
        modelPartData.addChild(
                EntityModelPartNames.BODY,
                ModelPartBuilder.create()
                        .uv(0, 17).cuboid(-4.0F, 0.0F, -2.0F, 8, 12, 4)
                        .uv(30, 47).cuboid(-4.0F, 0.0F, -2.0F, 8, 12, 4, new Dilation(0.25F))
                        .uv(50, 2).cuboid(-4.0F, 12.5F, -2.0F, 8, 4, 4, new Dilation(0.25F)),
                ModelTransform.pivot(0.0F, 0.0F, 0.0F)
        );

        // LEFT ARM
        ModelPartData leftArm = modelPartData.addChild(
                EntityModelPartNames.LEFT_ARM,
                ModelPartBuilder.create()
                        .uv(25, 17).cuboid(-1.0F, -2.0F, -2.0F, 4, 12, 4)
                        .uv(38, 30).cuboid(-1.0F, -2.0F, -2.0F, 4, 12, 4, new Dilation(0.25F)),
                ModelTransform.of(5.0F, 2.0F, 0.0F, -1.5708F, 0, 0)
        );

        leftArm.addChild(
                "left_arm_r1",
                ModelPartBuilder.create()
                        .uv(12, 51).cuboid(-1.0F, -3.0F, -3.0F, 2, 4, 5),
                ModelTransform.of(2.0F, 1.0F, 4.0F, 0, (float)Math.PI, 0)
        );

        // RIGHT ARM
        ModelPartData rightArm = modelPartData.addChild(
                EntityModelPartNames.RIGHT_ARM,
                ModelPartBuilder.create()
                        .uv(25, 17).mirrored().cuboid(-3.0F, -2.0F, -2.0F, 4, 12, 4).mirrored(false)
                        .uv(12, 51).cuboid(-3.0F, -2.0F, -7.0F, 2, 4, 5),
                ModelTransform.of(-5.0F, 2.0F, 0.0F, -1.5708F, 0, 0)
        );

        // LEFT LEG
        modelPartData.addChild(
                EntityModelPartNames.LEFT_LEG,
                ModelPartBuilder.create()
                        .uv(33, 0).cuboid(-1.9F, 0.0F, -2.0F, 4, 12, 4),
                ModelTransform.pivot(1.9F, 12.0F, 0.0F)
        );

        // RIGHT LEG
        modelPartData.addChild(
                EntityModelPartNames.RIGHT_LEG,
                ModelPartBuilder.create()
                        .uv(48, 13).mirrored().cuboid(-2.1F, 0.0F, -2.0F, 4, 12, 4).mirrored(false),
                ModelTransform.pivot(-1.9F, 12.0F, 0.0F)
        );

        return TexturedModelData.of(modelData, 128, 128);
    }

    @Override
    public void setAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setAngles(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    }
}
