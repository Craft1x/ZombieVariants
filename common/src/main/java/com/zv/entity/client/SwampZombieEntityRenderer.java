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
public class SwampZombieEntityRenderer extends ZombieBaseEntityRenderer<CustomZombieEntity, SwampZombieEntityModel<CustomZombieEntity>> {
    private static final Identifier TEXTURE = Utils.id("textures/entity/swamp_zombie.png");

    public SwampZombieEntityRenderer(EntityRendererFactory.Context context) {
        this(context, ModEntityModelLayers.SWAMP_ZOMBIE, EntityModelLayers.ZOMBIE_INNER_ARMOR, EntityModelLayers.ZOMBIE_OUTER_ARMOR);
    }

    public SwampZombieEntityRenderer(EntityRendererFactory.Context ctx, EntityModelLayer layer, EntityModelLayer legsArmorLayer, EntityModelLayer bodyArmorLayer) {
        super(ctx, new SwampZombieEntityModel<>(ctx.getPart(layer)), new SwampZombieEntityModel<>(ctx.getPart(legsArmorLayer)), new SwampZombieEntityModel<>(ctx.getPart(bodyArmorLayer)));
    }

    @Override
    public Identifier getTexture(CustomZombieEntity entity) {
        return TEXTURE;
    }
}

