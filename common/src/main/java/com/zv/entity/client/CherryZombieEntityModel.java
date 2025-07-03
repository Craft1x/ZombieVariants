package com.zv.entity.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.render.entity.model.ZombieEntityModel;
import net.minecraft.entity.mob.ZombieEntity;

@Environment(EnvType.CLIENT)
public class CherryZombieEntityModel<T extends ZombieEntity> extends ZombieEntityModel<T> {
    public CherryZombieEntityModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        float pivotOffsetY = 24.0F; // Matches new model’s coordinate system

        // Head
        ModelPartData head = modelPartData.addChild(
                EntityModelPartNames.HEAD,
                ModelPartBuilder.create()
                        .uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
                        .uv(1, 34).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.25F)),
                ModelTransform.pivot(0.0F, 0.0F + pivotOffsetY, 0.0F)
        );

        // Brows
        head.addChild(
                "brow1",
                ModelPartBuilder.create()
                        .uv(0, 34).cuboid(-2.0F, -1.5F, 0.0F, 4.0F, 2.0F, 0.0F, new Dilation(0.0F)),
                ModelTransform.of(2.25F, -5.0F, -4.2F, 0.0F, 0.0F, -0.1309F)
        );

        head.addChild(
                "brow2",
                ModelPartBuilder.create()
                        .uv(0, 34).mirrored().cuboid(-2.0F, -1.5F, 0.0F, 4.0F, 2.0F, 0.0F, new Dilation(0.0F)).mirrored(false),
                ModelTransform.of(-2.25F, -5.0F, -4.2F, 0.0F, 0.0F, 0.1309F)
        );

        // Hat (invisible)
        modelPartData.addChild(
                EntityModelPartNames.HAT,
                ModelPartBuilder.create(),
                ModelTransform.pivot(0.0F, 0.0F + pivotOffsetY, 0.0F)
        );

        // Body
        modelPartData.addChild(
                EntityModelPartNames.BODY,
                ModelPartBuilder.create()
                        .uv(0, 17).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F))
                        .uv(30, 47).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.25F)),
                ModelTransform.pivot(0.0F, 0.0F + pivotOffsetY, 0.0F)
        );

        // Right Arm

                ModelPartData rightArm = modelPartData.addChild(
                        EntityModelPartNames.RIGHT_ARM,
                        ModelPartBuilder.create()
                                .uv(25, 17).mirrored().cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false),
                        ModelTransform.of(-5.0F, 2.0F + pivotOffsetY, 0.0F, -1.5708F, 0.0F, 0.0F)
                );

        // Bamboo under Right Arm
        rightArm.addChild(
                "bamboo_right",
                ModelPartBuilder.create()
                        .uv(12, 51).cuboid(-1.0F, -1.0F, -2.5F, 2.0F, 4.0F, 5.0F, new Dilation(0.0F)),
                ModelTransform.of(-2.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F)
        );

        // Left Arm
        ModelPartData leftArm = modelPartData.addChild(
                EntityModelPartNames.LEFT_ARM,
                ModelPartBuilder.create()
                        .uv(25, 17).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
                        .uv(38, 30).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.25F)),
                ModelTransform.of(5.0F, 2.0F + pivotOffsetY, 0.0F, -1.5708F, 0.0F, 0.0F)
        );

        // Bamboo under Left Arm
        leftArm.addChild(
                "bamboo_left",
                ModelPartBuilder.create()
                        .uv(12, 51).cuboid(-1.0F, -1.0F, -2.5F, 2.0F, 4.0F, 5.0F, new Dilation(0.0F)),
                ModelTransform.of(0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F)
        );

        // Right Leg
        modelPartData.addChild(
                EntityModelPartNames.RIGHT_LEG,
                ModelPartBuilder.create()
                        .uv(48, 13).mirrored().cuboid(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false),
                ModelTransform.pivot(-1.9F, 12.0F + pivotOffsetY, 0.0F)
        );

        // Left Leg
        modelPartData.addChild(
                EntityModelPartNames.LEFT_LEG,
                ModelPartBuilder.create()
                        .uv(33, 0).cuboid(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)),
                ModelTransform.pivot(1.9F, 12.0F + pivotOffsetY, 0.0F)
        );

        return TexturedModelData.of(modelData, 64, 64); // Matches new model’s texture size
    }

    @Override
    public void setAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setAngles(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    }
}