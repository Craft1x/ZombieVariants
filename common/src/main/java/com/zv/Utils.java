package com.zv;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.Chunk;

public class Utils {

    public static Identifier id(String path) {
        return Identifier.of(ModCommon.MOD_ID, path);
    }

    public static EntityType<?> tryReplaceZombie(ServerWorld world, EntityType<?> type, SpawnGroup group, BlockPos pos, Chunk chunk) {
        var biomeHolder = world.getBiome(pos);
        if (biomeHolder.isIn(ModTags.SPAWNS_DEEP_DARK_ZOMBIES)) {
            return ModEntities.DEEP_DARK_ZOMBIE.get();
        }
        if (biomeHolder.isIn(ModTags.SPAWNS_DRIPSTONE_ZOMBIES)) {
            return ModEntities.DRIPSTONE_ZOMBIE.get();
        }
        if (pos.getY() < world.getSeaLevel() - 50) {
            return ModEntities.CAVE_ZOMBIE.get();
        }



        if (biomeHolder.isIn(ModTags.SPAWNS_BADLANDS_ZOMBIES)) {
            return ModEntities.BADLANDS_ZOMBIE.get();
        }
        if (biomeHolder.isIn(ModTags.SPAWNS_BAMBOO_ZOMBIES)) {
            return ModEntities.BAMBOO_ZOMBIE.get();
        }
        if (biomeHolder.isIn(ModTags.SPAWNS_CHERRY_ZOMBIES)) {
            return ModEntities.CHERRY_ZOMBIE.get();
        }

        if (biomeHolder.isIn(ModTags.SPAWNS_DESERT_ZOMBIES)) {
            return ModEntities.DESERT_ZOMBIE.get();
        }
        if (biomeHolder.isIn(ModTags.SPAWNS_FROZEN_ZOMBIES)) {
            return ModEntities.FROZEN_ZOMBIE.get();
        }
        if (biomeHolder.isIn(ModTags.SPAWNS_JUNGLE_ZOMBIES)) {
            return ModEntities.JUNGLE_ZOMBIE.get();
        }
        if (biomeHolder.isIn(ModTags.SPAWNS_LUSH_ZOMBIES)) {
            return ModEntities.LUSH_ZOMBIE.get();
        }
        if (biomeHolder.isIn(ModTags.SPAWNS_MANGROVE_ZOMBIES)) {
            return ModEntities.MANGROVE_ZOMBIE.get();
        }
        if (biomeHolder.isIn(ModTags.SPAWNS_PALE_GARDEN_ZOMBIES)) {
            return ModEntities.PALE_GARDEN_ZOMBIE.get();
        }
        if (biomeHolder.isIn(ModTags.SPAWNS_SAVANNA_ZOMBIES)) {
            return ModEntities.SAVANNA_ZOMBIE.get();
        }
        if (biomeHolder.isIn(ModTags.SPAWNS_SWAMP_ZOMBIES)) {
            return ModEntities.SWAMP_ZOMBIE.get();
        }
        if (biomeHolder.isIn(ModTags.SPAWNS_MUSHROOM_ZOMBIES)) {
            return ModEntities.MUSHROOM_ZOMBIE.get();
        }

        return type;
    }
}
