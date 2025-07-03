package com.zv;

import dev.architectury.registry.level.biome.BiomeModifications;
import net.minecraft.world.biome.SpawnSettings;

public final class ModCommon {
    public static final String MOD_ID = "zombie_variants";

    public static void init() {
        // Write common init code here.
        ModEntities.initEntityTypes();
        ModItems.register();

        BiomeModifications.addProperties((biome, builder) -> {
            if (biome.hasTag(ModTags.SPAWNS_MUSHROOM_ZOMBIES)) {
                builder.getSpawnProperties().addSpawn(net.minecraft.entity.SpawnGroup.MONSTER,
                        new SpawnSettings.SpawnEntry(
                                ModEntities.MUSHROOM_ZOMBIE.get(),
                                50, // Weight
                                1,  // Min group size
                                1  // Max group size
                        ));
            }
        });
    }
}
