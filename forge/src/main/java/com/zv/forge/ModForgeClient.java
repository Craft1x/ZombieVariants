package com.zv.forge;

import com.zv.ModCommon;
import com.zv.ModRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ModCommon.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ModForgeClient {

    public static void init( ) {
        ModRenderers.register();
    }

    @SubscribeEvent
    public static void setup(FMLClientSetupEvent event) {

         event.enqueueWork(() -> {

        });
    }
}
