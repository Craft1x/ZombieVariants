package com.zv.forge;

import com.zv.*;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

@Mod.EventBusSubscriber(modid = ModCommon.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class EventHandler {

    @SubscribeEvent
    public static void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
        ModEntities.ATTRIBUTES.forEach((key, value) -> {
            event.put(key.get(), value.get().build());
        });
    }

    @SubscribeEvent
    public static void register(RegisterEvent event) {

      //  event.register(ForgeRegistries.Keys.ENTITY_TYPES, entityTypeRegisterHelper -> {
      //      ModEntities.register();
      //  });

    }

    @SubscribeEvent
    public static void onEntityTypeBuildEvent(FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        // event.registerLayerDefinition(ModEntityModelLayers.MUSHROOM_ZOMBIE, MushroomZombieEntityModel::getTexturedModelData);
        // event.registerLayerDefinition(ModEntityModelLayers.BADLANDS_ZOMBIE, MushroomZombieEntityModel::getTexturedModelData);
    }
}