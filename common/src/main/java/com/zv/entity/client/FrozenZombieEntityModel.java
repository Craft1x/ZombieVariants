package com.zv.entity.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.render.entity.model.ZombieEntityModel;
import net.minecraft.entity.mob.ZombieEntity;

@Environment(EnvType.CLIENT)
public class FrozenZombieEntityModel<T extends ZombieEntity> extends ZombieEntityModel<T> {
    public FrozenZombieEntityModel(ModelPart root) {
        super(root);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();

        // Head
        ModelPartData head = modelPartData.addChild(
                EntityModelPartNames.HEAD,
                ModelPartBuilder.create()
                        .uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)),
                ModelTransform.pivot(0.0F, 0.0F, 0.0F)
        );

        // Brows
        ModelPartData brow1 = head.addChild("brow1", ModelPartBuilder.create(), ModelTransform.pivot(2.25F, -5.0F, -4.2F));
        brow1.addChild("head_r1",
                ModelPartBuilder.create()
                        .uv(0, 34).cuboid(-2.0F, -1.5F, 0.0F, 4.0F, 2.0F, 0.0F),
                ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F)
        );

        ModelPartData brow2 = head.addChild("brow2", ModelPartBuilder.create(), ModelTransform.pivot(-2.25F, -5.0F, -4.2F));
        brow2.addChild("head_r2",
                ModelPartBuilder.create()
                        .uv(0, 34).mirrored().cuboid(-2.0F, -1.5F, 0.0F, 4.0F, 2.0F, 0.0F).mirrored(false),
                ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F)
        );

        // Hat (invisible)
        modelPartData.addChild(EntityModelPartNames.HAT,
                ModelPartBuilder.create(),
                ModelTransform.of(0.0F, -8.0F, 0.0F, 0, 0, 0)
        );

        // Body
        ModelPartData body = modelPartData.addChild(
                EntityModelPartNames.BODY,
                ModelPartBuilder.create()
                        .uv(0, 17).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F),
                ModelTransform.pivot(0.0F, 0.0F, 0.0F)
        );

        // Spikes under body
        body.addChild("spike1",
                ModelPartBuilder.create()
                        .uv(23, 29).cuboid(-1.75F, 5.0F, 2.0F, 0.0F, 5.0F, 5.0F),
                ModelTransform.pivot(0.0F, 0.0F, 0.0F)
        );

        ModelPartData spike2 = body.addChild("spike2", ModelPartBuilder.create(), ModelTransform.pivot(0.75F, 5.0F, 5.0F));
        spike2.addChild("body_r1",
                ModelPartBuilder.create()
                        .uv(9, 28).cuboid(0.0F, -2.5F, -3.0F, 0.0F, 5.0F, 6.0F),
                ModelTransform.of(0, 0, 0, 0, 0, -0.7854F)
        );

        ModelPartData spike3 = body.addChild("spike3", ModelPartBuilder.create(), ModelTransform.pivot(0.75F, 5.0F, 5.0F));
        spike3.addChild("body_r2",
                ModelPartBuilder.create()
                        .uv(9, 28).mirrored().cuboid(0.0F, -2.5F, -3.0F, 0.0F, 5.0F, 6.0F).mirrored(false),
                ModelTransform.of(0, 0, 0, 0, 0, 0.7854F)
        );

        ModelPartData spike4 = body.addChild("spike4", ModelPartBuilder.create(), ModelTransform.pivot(-1.75F, 7.5F, 4.0F));

        spike4.addChild("body_r3",
                ModelPartBuilder.create()
                        .uv(23, 29).mirrored().cuboid(0.0F, -2.5F, -2.0F, 0.0F, 5.0F, 5.0F).mirrored(false),
                ModelTransform.of(0, 0, 0, 0, 0, 1.5708F)
        );

        // Right Arm
        modelPartData.addChild(
                EntityModelPartNames.RIGHT_ARM,
                ModelPartBuilder.create()
                        .uv(25, 17).mirrored().cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F).mirrored(false),
                ModelTransform.of(-5.0F, 2.0F, 0.0F, -1.5708F, 0.0F, 0.0F)
        );

        // Left Arm
        modelPartData.addChild(
                EntityModelPartNames.LEFT_ARM,
                ModelPartBuilder.create()
                        .uv(25, 17).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F),
                ModelTransform.of(5.0F, 2.0F, 0.0F, -1.5708F, 0.0F, 0.0F)
        );

        // Right Leg
        modelPartData.addChild(
                EntityModelPartNames.RIGHT_LEG,
                ModelPartBuilder.create()
                        .uv(33, 0).mirrored().cuboid(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F).mirrored(false),
                ModelTransform.pivot(-1.9F, 12.0F, 0.0F)
        );

        // Left Leg
        modelPartData.addChild(
                EntityModelPartNames.LEFT_LEG,
                ModelPartBuilder.create()
                        .uv(33, 0).cuboid(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F),
                ModelTransform.pivot(1.9F, 12.0F, 0.0F)
        );

        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void setAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setAngles(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    }
}
