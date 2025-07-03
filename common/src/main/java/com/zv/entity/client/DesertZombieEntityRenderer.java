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
public class DesertZombieEntityRenderer extends ZombieBaseEntityRenderer<CustomZombieEntity, DesertZombieEntityModel<CustomZombieEntity>> {
    private static final Identifier TEXTURE = Utils.id("textures/entity/desert_zombie.png");

    public DesertZombieEntityRenderer(EntityRendererFactory.Context context) {
        this(context, ModEntityModelLayers.DESERT_ZOMBIE, EntityModelLayers.ZOMBIE_INNER_ARMOR, EntityModelLayers.ZOMBIE_OUTER_ARMOR);
    }

    public DesertZombieEntityRenderer(EntityRendererFactory.Context ctx, EntityModelLayer layer, EntityModelLayer legsArmorLayer, EntityModelLayer bodyArmorLayer) {
        super(ctx, new DesertZombieEntityModel<>(ctx.getPart(layer)), new DesertZombieEntityModel<>(ctx.getPart(legsArmorLayer)), new DesertZombieEntityModel<>(ctx.getPart(bodyArmorLayer)));
    }

    @Override
    public Identifier getTexture(CustomZombieEntity entity) {
        return TEXTURE;
    }
}

