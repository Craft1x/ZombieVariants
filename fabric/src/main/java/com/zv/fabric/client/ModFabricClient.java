package com.zv.fabric.client;

import com.zv.ModRenderers;
import net.fabricmc.api.ClientModInitializer;

public final class ModFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
      ModRenderers.register();

        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
    }
}
