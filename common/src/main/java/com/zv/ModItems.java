package com.zv;

import dev.architectury.core.item.ArchitecturySpawnEggItem;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.awt.*;
import java.util.function.Supplier;

public class ModItems {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ModCommon.MOD_ID, RegistryKeys.ITEM);

    public static final RegistrySupplier<Item> MUSHROOM_ZOMBIE_SPAWN_EGG = register(Utils.id("mushroom_zombie_spawn_egg"), () -> new ArchitecturySpawnEggItem(
            ModEntities.MUSHROOM_ZOMBIE,
            new Color(255, 0, 0).getRGB(),
            new Color(242, 222, 146).getRGB(),
            new Item.Settings().arch$tab(ItemGroups.SPAWN_EGGS)
    ));

    public static final RegistrySupplier<Item> BADLANDS_ZOMBIE_SPAWN_EGG = register(Utils.id("badlands_zombie_spawn_egg"), () -> new ArchitecturySpawnEggItem(
            ModEntities.BADLANDS_ZOMBIE,
            new Color(140, 83, 20).getRGB(),
            new Color(101, 105, 110).getRGB(),
            new Item.Settings().arch$tab(ItemGroups.SPAWN_EGGS)
    ));

    public static final RegistrySupplier<Item> BAMBOO_ZOMBIE_SPAWN_EGG = register(Utils.id("bamboo_zombie_spawn_egg"), () -> new ArchitecturySpawnEggItem(
            ModEntities.BAMBOO_ZOMBIE,
            new Color(121, 197, 10).getRGB(),
            new Color(205, 172, 96).getRGB(),
            new Item.Settings().arch$tab(ItemGroups.SPAWN_EGGS)
    ));

    public static final RegistrySupplier<Item> CAVE_ZOMBIE_SPAWN_EGG = register(Utils.id("cave_zombie_spawn_egg"), () -> new ArchitecturySpawnEggItem(
            ModEntities.CAVE_ZOMBIE,
            new Color(95, 95, 95).getRGB(),
            new Color(64, 76, 115).getRGB(),
            new Item.Settings().arch$tab(ItemGroups.SPAWN_EGGS)
    ));

    public static final RegistrySupplier<Item> CHERRY_ZOMBIE_SPAWN_EGG = register(Utils.id("cherry_zombie_spawn_egg"), () -> new ArchitecturySpawnEggItem(
            ModEntities.CHERRY_ZOMBIE,
            new Color(255, 176, 189).getRGB(),
            new Color(85, 26, 41).getRGB(),
            new Item.Settings().arch$tab(ItemGroups.SPAWN_EGGS)
    ));

    public static final RegistrySupplier<Item> DEEP_DARK_ZOMBIE_SPAWN_EGG = register(Utils.id("deep_dark_zombie_spawn_egg"), () -> new ArchitecturySpawnEggItem(
            ModEntities.DEEP_DARK_ZOMBIE,
            new Color(41, 41, 46).getRGB(),
            new Color(155, 157, 168).getRGB(),
            new Item.Settings().arch$tab(ItemGroups.SPAWN_EGGS)
    ));

    public static final RegistrySupplier<Item> DESERT_ZOMBIE_SPAWN_EGG = register(Utils.id("desert_zombie_spawn_egg"), () -> new ArchitecturySpawnEggItem(
            ModEntities.DESERT_ZOMBIE,
            new Color(255, 224, 167).getRGB(),
            new Color(195, 126, 29).getRGB(),
            new Item.Settings().arch$tab(ItemGroups.SPAWN_EGGS)
    ));

    public static final RegistrySupplier<Item> DRIPSTONE_ZOMBIE_SPAWN_EGG = register(Utils.id("dripstone_zombie_spawn_egg"), () -> new ArchitecturySpawnEggItem(
            ModEntities.DRIPSTONE_ZOMBIE,
            new Color(195, 95, 29).getRGB(),
            new Color(103, 95, 86).getRGB(),
            new Item.Settings().arch$tab(ItemGroups.SPAWN_EGGS)
    ));

    public static final RegistrySupplier<Item> FROZEN_ZOMBIE_SPAWN_EGG = register(Utils.id("frozen_zombie_spawn_egg"), () -> new ArchitecturySpawnEggItem(
            ModEntities.FROZEN_ZOMBIE,
            new Color(20, 165, 222).getRGB(),
            new Color(24, 98, 205).getRGB(),
            new Item.Settings().arch$tab(ItemGroups.SPAWN_EGGS)
    ));

    public static final RegistrySupplier<Item> JUNGLE_ZOMBIE_SPAWN_EGG = register(Utils.id("jungle_zombie_spawn_egg"), () -> new ArchitecturySpawnEggItem(
            ModEntities.JUNGLE_ZOMBIE,
            new Color(104, 221, 21).getRGB(),
            new Color(215, 191, 79).getRGB(),
            new Item.Settings().arch$tab(ItemGroups.SPAWN_EGGS)
    ));

    public static final RegistrySupplier<Item> LUSH_ZOMBIE_SPAWN_EGG = register(Utils.id("lush_zombie_spawn_egg"), () -> new ArchitecturySpawnEggItem(
            ModEntities.LUSH_ZOMBIE,
            new Color(80, 142, 18).getRGB(),
            new Color(209, 86, 162).getRGB(),
            new Item.Settings().arch$tab(ItemGroups.SPAWN_EGGS)
    ));

    public static final RegistrySupplier<Item> MANGROVE_ZOMBIE_SPAWN_EGG = register(Utils.id("mangrove_zombie_spawn_egg"), () -> new ArchitecturySpawnEggItem(
            ModEntities.MANGROVE_ZOMBIE,
            new Color(110, 72, 11).getRGB(),
            new Color(138, 122, 58).getRGB(),
            new Item.Settings().arch$tab(ItemGroups.SPAWN_EGGS)
    ));

    public static final RegistrySupplier<Item> PALE_GARDEN_ZOMBIE_SPAWN_EGG = register(Utils.id("pale_garden_zombie_spawn_egg"), () -> new ArchitecturySpawnEggItem(
            ModEntities.PALE_GARDEN_ZOMBIE,
            new Color(51, 48, 48).getRGB(),
            new Color(255, 157, 0).getRGB(),
            new Item.Settings().arch$tab(ItemGroups.SPAWN_EGGS)
    ));

    public static final RegistrySupplier<Item> SAVANNA_ZOMBIE_SPAWN_EGG = register(Utils.id("savanna_zombie_spawn_egg"), () -> new ArchitecturySpawnEggItem(
            ModEntities.SAVANNA_ZOMBIE,
            new Color(177, 101, 19).getRGB(),
            new Color(201, 57, 25).getRGB(),
            new Item.Settings().arch$tab(ItemGroups.SPAWN_EGGS)
    ));

    public static final RegistrySupplier<Item> SWAMP_ZOMBIE_SPAWN_EGG = register(Utils.id("swamp_zombie_spawn_egg"), () -> new ArchitecturySpawnEggItem(
            ModEntities.SWAMP_ZOMBIE,
            new Color(65, 97, 47).getRGB(),
            new Color(125, 69, 8).getRGB(),
            new Item.Settings().arch$tab(ItemGroups.SPAWN_EGGS)
    ));



    private static RegistrySupplier<Item> register(Identifier id, Supplier<Item> item) {
        return ITEMS.register(id, item);
    }

    public static void register() {
        ITEMS.register();
    }
}