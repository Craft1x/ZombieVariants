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
public class SavannaZombieEntityRenderer extends ZombieBaseEntityRenderer<CustomZombieEntity, SavannaZombieEntityModel<CustomZombieEntity>> {
    private static final Identifier TEXTURE = Utils.id("textures/entity/savanna_zombie.png");

    public SavannaZombieEntityRenderer(EntityRendererFactory.Context context) {
        this(context, ModEntityModelLayers.SAVANNA_ZOMBIE, EntityModelLayers.ZOMBIE_INNER_ARMOR, EntityModelLayers.ZOMBIE_OUTER_ARMOR);
    }

    public SavannaZombieEntityRenderer(EntityRendererFactory.Context ctx, EntityModelLayer layer, EntityModelLayer legsArmorLayer, EntityModelLayer bodyArmorLayer) {
        super(ctx, new SavannaZombieEntityModel<>(ctx.getPart(layer)), new SavannaZombieEntityModel<>(ctx.getPart(legsArmorLayer)), new SavannaZombieEntityModel<>(ctx.getPart(bodyArmorLayer)));
    }

    @Override
    public Identifier getTexture(CustomZombieEntity entity) {
        return TEXTURE;
    }
}

