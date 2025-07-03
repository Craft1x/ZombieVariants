package com.zv;

import net.minecraft.client.render.entity.model.EntityModelLayer;

public class ModEntityModelLayers {
    public static final EntityModelLayer BADLANDS_ZOMBIE = new EntityModelLayer(Utils.id("badlands_zombie"), "main");
    public static final EntityModelLayer BAMBOO_ZOMBIE = new EntityModelLayer(Utils.id("bamboo_zombie"), "main");
    public static final EntityModelLayer CAVE_ZOMBIE = new EntityModelLayer(Utils.id("cave_zombie"), "main");
    public static final EntityModelLayer CHERRY_ZOMBIE = new EntityModelLayer(Utils.id("cherry_zombie"), "main");
    public static final EntityModelLayer DEEP_DARK_ZOMBIE = new EntityModelLayer(Utils.id("deep_dark_zombie"), "main");
    public static final EntityModelLayer DESERT_ZOMBIE = new EntityModelLayer(Utils.id("desert_zombie"), "main");
    public static final EntityModelLayer DRIPSTONE_ZOMBIE = new EntityModelLayer(Utils.id("dripstone_zombie"), "main");
    public static final EntityModelLayer FROZEN_ZOMBIE = new EntityModelLayer(Utils.id("frozen_zombie"), "main");
    public static final EntityModelLayer JUNGLE_ZOMBIE = new EntityModelLayer(Utils.id("jungle_zombie"), "main");
    public static final EntityModelLayer LUSH_ZOMBIE = new EntityModelLayer(Utils.id("lush_zombie"), "main");
    public static final EntityModelLayer MANGROVE_ZOMBIE = new EntityModelLayer(Utils.id("mangrove_zombie"), "main");
    public static final EntityModelLayer PALE_GARDEN_ZOMBIE = new EntityModelLayer(Utils.id("pale_garden_zombie"), "main");
    public static final EntityModelLayer SAVANNA_ZOMBIE = new EntityModelLayer(Utils.id("savanna_zombie"), "main");
    public static final EntityModelLayer SWAMP_ZOMBIE = new EntityModelLayer(Utils.id("swamp_zombie"), "main");
    public static final EntityModelLayer MUSHROOM_ZOMBIE = new EntityModelLayer(Utils.id("mushroom_zombie"), "main");
    // Called from client initializer
    public static void register() {
        // No direct registration needed here; layers are registered in the renderer
    }
}