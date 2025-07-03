package com.zv;

import com.zv.entity.client.*;
import dev.architectury.registry.client.level.entity.EntityModelLayerRegistry;
import dev.architectury.registry.client.level.entity.EntityRendererRegistry;

public class ModRenderers {
    public static void register() {
        EntityModelLayerRegistry.register(ModEntityModelLayers.BADLANDS_ZOMBIE, BadlandsZombieEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(() -> ModEntities.BADLANDS_ZOMBIE.get(), BadlandsZombieEntityRenderer::new);
        EntityModelLayerRegistry.register(ModEntityModelLayers.BAMBOO_ZOMBIE, BambooZombieEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(() -> ModEntities.BAMBOO_ZOMBIE.get(), BambooZombieEntityRenderer::new);
        EntityModelLayerRegistry.register(ModEntityModelLayers.CAVE_ZOMBIE, CaveZombieEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(() -> ModEntities.CAVE_ZOMBIE.get(), CaveZombieEntityRenderer::new);
        EntityModelLayerRegistry.register(ModEntityModelLayers.CHERRY_ZOMBIE, CherryZombieEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(() -> ModEntities.CHERRY_ZOMBIE.get(), CherryZombieEntityRenderer::new);
        EntityModelLayerRegistry.register(ModEntityModelLayers.DEEP_DARK_ZOMBIE, DeepDarkZombieEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(() -> ModEntities.DEEP_DARK_ZOMBIE.get(), DeepDarkZombieEntityRenderer::new);
        EntityModelLayerRegistry.register(ModEntityModelLayers.DESERT_ZOMBIE, DesertZombieEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(() -> ModEntities.DESERT_ZOMBIE.get(), DesertZombieEntityRenderer::new);
        EntityModelLayerRegistry.register(ModEntityModelLayers.DRIPSTONE_ZOMBIE, DripstoneZombieEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(() -> ModEntities.DRIPSTONE_ZOMBIE.get(), DripstoneZombieEntityRenderer::new);
        EntityModelLayerRegistry.register(ModEntityModelLayers.FROZEN_ZOMBIE, FrozenZombieEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(() -> ModEntities.FROZEN_ZOMBIE.get(), FrozenZombieEntityRenderer::new);
        EntityModelLayerRegistry.register(ModEntityModelLayers.JUNGLE_ZOMBIE, JungleZombieEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(() -> ModEntities.JUNGLE_ZOMBIE.get(), JungleZombieEntityRenderer::new);
        EntityModelLayerRegistry.register(ModEntityModelLayers.LUSH_ZOMBIE, LushZombieEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(() -> ModEntities.LUSH_ZOMBIE.get(), LushZombieEntityRenderer::new);
        EntityModelLayerRegistry.register(ModEntityModelLayers.MANGROVE_ZOMBIE, MangroveZombieEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(() -> ModEntities.MANGROVE_ZOMBIE.get(), MangroveZombieEntityRenderer::new);
        EntityModelLayerRegistry.register(ModEntityModelLayers.PALE_GARDEN_ZOMBIE, PaleGardenZombieEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(() -> ModEntities.PALE_GARDEN_ZOMBIE.get(), PaleGardenZombieEntityRenderer::new);
        EntityModelLayerRegistry.register(ModEntityModelLayers.SAVANNA_ZOMBIE, SavannaZombieEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(() -> ModEntities.SAVANNA_ZOMBIE.get(), SavannaZombieEntityRenderer::new);
        EntityModelLayerRegistry.register(ModEntityModelLayers.SWAMP_ZOMBIE, SwampZombieEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(() -> ModEntities.SWAMP_ZOMBIE.get(), SwampZombieEntityRenderer::new);
        EntityModelLayerRegistry.register(ModEntityModelLayers.MUSHROOM_ZOMBIE, MushroomZombieEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(() -> ModEntities.MUSHROOM_ZOMBIE.get(), MushroomZombieEntityRenderer::new);
    }
}