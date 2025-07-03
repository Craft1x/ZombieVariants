package com.zv.entity.client;

import com.zv.ModEntityModelLayers;
import com.zv.Utils;
import com.zv.entity.CustomZombieEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ZombieBaseEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class BadlandsZombieEntityRenderer extends ZombieBaseEntityRenderer<CustomZombieEntity, BadlandsZombieEntityModel<CustomZombieEntity>> {
    private static final Identifier TEXTURE = Utils.id("textures/entity/badlands_zombie.png");

    public BadlandsZombieEntityRenderer(EntityRendererFactory.Context context) {
        this(context, ModEntityModelLayers.BADLANDS_ZOMBIE, EntityModelLayers.ZOMBIE_INNER_ARMOR, EntityModelLayers.ZOMBIE_OUTER_ARMOR);
    }

    public BadlandsZombieEntityRenderer(EntityRendererFactory.Context ctx, EntityModelLayer layer, EntityModelLayer legsArmorLayer, EntityModelLayer bodyArmorLayer) {
        super(ctx, new BadlandsZombieEntityModel<>(ctx.getPart(layer)), new BadlandsZombieEntityModel<>(ctx.getPart(legsArmorLayer)), new BadlandsZombieEntityModel<>(ctx.getPart(bodyArmorLayer)));
    }

    @Override
    public Identifier getTexture(CustomZombieEntity entity) {
        return TEXTURE;
    }
}

