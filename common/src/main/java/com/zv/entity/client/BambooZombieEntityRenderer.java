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
public class BambooZombieEntityRenderer extends ZombieBaseEntityRenderer<CustomZombieEntity, BambooZombieEntityModel<CustomZombieEntity>> {
    private static final Identifier TEXTURE = Utils.id("textures/entity/bamboo_zombie.png");

    public BambooZombieEntityRenderer(EntityRendererFactory.Context context) {
        this(context, ModEntityModelLayers.BAMBOO_ZOMBIE, EntityModelLayers.ZOMBIE_INNER_ARMOR, EntityModelLayers.ZOMBIE_OUTER_ARMOR);
    }

    public BambooZombieEntityRenderer(EntityRendererFactory.Context ctx, EntityModelLayer layer, EntityModelLayer legsArmorLayer, EntityModelLayer bodyArmorLayer) {
        super(ctx, new BambooZombieEntityModel<>(ctx.getPart(layer)), new BambooZombieEntityModel<>(ctx.getPart(legsArmorLayer)), new BambooZombieEntityModel<>(ctx.getPart(bodyArmorLayer)));
    }

    @Override
    public Identifier getTexture(CustomZombieEntity entity) {
        return TEXTURE;
    }
}

