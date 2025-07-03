package com.zv.fabric;

import com.zv.ModEntities;
import com.zv.ModItems;
import com.zv.ModTags;
import com.zv.entity.CustomZombieEntity;
import net.fabricmc.api.ModInitializer;

import com.zv.ModCommon;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.SpawnGroup;

public final class ModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.

        ModCommon.init();

        ModEntities.ATTRIBUTES.forEach((key, value) -> {
            FabricDefaultAttributeRegistry.register(key.get(), value.get());
        });
    }
}
