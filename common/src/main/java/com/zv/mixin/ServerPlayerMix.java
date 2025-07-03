package com.zv.mixin;

import net.minecraft.server.network.ServerPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerPlayerEntity.class)
public class ServerPlayerMix {
    @Inject(method = "tick", at = @At("HEAD"))
    private void injectedHead(CallbackInfo ci) {
        //System.out.println("mixins work");
    }
}