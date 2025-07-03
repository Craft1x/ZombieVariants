package com.zv.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import com.zv.ModCommon;
import net.minecraftforge.fml.loading.FMLEnvironment;

@Mod(ModCommon.MOD_ID)
public final class ModForge {
    public ModForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(ModCommon.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        ModCommon.init();

        if (FMLEnvironment.dist == Dist.CLIENT) {
            ModForgeClient.init();
        }
    }
}
