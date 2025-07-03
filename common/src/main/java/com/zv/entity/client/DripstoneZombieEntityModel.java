package com.zv.entity.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.render.entity.model.ZombieEntityModel;
import net.minecraft.entity.mob.ZombieEntity;

@Environment(EnvType.CLIENT)
public class DripstoneZombieEntityModel<T extends ZombieEntity> extends ZombieEntityModel<T> {
    public DripstoneZombieEntityModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        float pivotOffsetY = 24.0F;

        ModelPartData head = modelPartData.addChild(
                EntityModelPartNames.HEAD,
                ModelPartBuilder.create()
                        .uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
                        .uv(1, 34).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.25F)),
                ModelTransform.pivot(0.0F, 0.0F + pivotOffsetY, 0.0F)
        );

        ModelPartData brow1 = head.addChild("brow1", ModelPartBuilder.create(),
                ModelTransform.pivot(2.25F, -5.0F, -4.2F));
        brow1.addChild("head_r1", ModelPartBuilder.create()
                        .uv(0, 34).cuboid(-2.0F, -1.5F, 0.0F, 4.0F, 2.0F, 0.0F, new Dilation(0.0F)),
                ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

        ModelPartData brow2 = head.addChild("brow2", ModelPartBuilder.create(),
                ModelTransform.pivot(-2.25F, -5.0F, -4.2F));
        brow2.addChild("head_r2", ModelPartBuilder.create()
                        .uv(0, 34).mirrored().cuboid(-2.0F, -1.5F, 0.0F, 4.0F, 2.0F, 0.0F, new Dilation(0.0F)).mirrored(false),
                ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

        ModelPartData dripstone2 = head.addChild("dripstone2", ModelPartBuilder.create(),
                ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        dripstone2.addChild("head_r3", ModelPartBuilder.create()
                        .uv(65, 13).cuboid(-3.5F, -4.0F, 0.0F, 7.0F, 8.0F, 0.0F, new Dilation(0.0F)),
                ModelTransform.of(0.0F, -12.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

        ModelPartData dripstone1 = head.addChild("dripstone1", ModelPartBuilder.create(),
                ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        dripstone1.addChild("head_r4", ModelPartBuilder.create()
                        .uv(65, 13).mirrored().cuboid(-3.5F, -4.0F, 0.0F, 7.0F, 8.0F, 0.0F, new Dilation(0.0F)).mirrored(false),
                ModelTransform.of(0.0F, -12.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

        // Invisible Hat
        modelPartData.addChild(EntityModelPartNames.HAT,
                ModelPartBuilder.create(),
                ModelTransform.of(0.0F, -8.0F + pivotOffsetY, 0.0F, 0.0F, 0.0F, 0.0F)
        );

        modelPartData.addChild(
                EntityModelPartNames.BODY,
                ModelPartBuilder.create()
                        .uv(0, 17).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F))
                        .uv(30, 47).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.25F))
                        .uv(50, 2).cuboid(-4.0F, 12.5F, -2.0F, 8.0F, 4.0F, 4.0F, new Dilation(0.25F)),
                ModelTransform.pivot(0.0F, 0.0F + pivotOffsetY, 0.0F)
        );

        ModelPartData rightArm = modelPartData.addChild(
                EntityModelPartNames.RIGHT_ARM,
                ModelPartBuilder.create()
                        .uv(25, 17).mirrored().cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
                        .uv(12, 51).cuboid(-3.0F, -2.0F, -7.0F, 2.0F, 4.0F, 5.0F, new Dilation(0.0F)),
                ModelTransform.of(-5.0F, 2.0F + pivotOffsetY, 0.0F, -1.5708F, 0.0F, 0.0F)
        );

        ModelPartData leftArm = modelPartData.addChild(
                EntityModelPartNames.LEFT_ARM,
                ModelPartBuilder.create()
                        .uv(25, 17).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
                        .uv(38, 30).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.25F))
                        .uv(12, 51).cuboid(-1.0F, -3.0F, -3.0F, 2.0F, 4.0F, 5.0F, new Dilation(0.0F)),
                ModelTransform.of(5.0F, 2.0F + pivotOffsetY, 0.0F, -1.5708F, 0.0F, 0.0F)
        );

        modelPartData.addChild(
                EntityModelPartNames.RIGHT_LEG,
                ModelPartBuilder.create()
                        .uv(48, 13).mirrored().cuboid(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false),
                ModelTransform.pivot(-1.9F, 12.0F + pivotOffsetY, 0.0F)
        );

        modelPartData.addChild(
                EntityModelPartNames.LEFT_LEG,
                ModelPartBuilder.create()
                        .uv(33, 0).cuboid(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)),
                ModelTransform.pivot(1.9F, 12.0F + pivotOffsetY, 0.0F)
        );

        return TexturedModelData.of(modelData, 128, 128);
    }

    @Override
    public void setAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setAngles(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    }
}
