package com.zv;

import com.zv.entity.CustomZombieEntity;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.registry.RegistryKeys;

import java.util.HashMap;
import java.util.function.Supplier;

public class ModEntities {
    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ModCommon.MOD_ID, RegistryKeys.ENTITY_TYPE);
    public static HashMap<Supplier<EntityType<? extends LivingEntity>>, Supplier<DefaultAttributeContainer.Builder>> ATTRIBUTES = new HashMap<>();

    public static RegistrySupplier<EntityType<CustomZombieEntity>> BADLANDS_ZOMBIE;
    public static RegistrySupplier<EntityType<CustomZombieEntity>> BAMBOO_ZOMBIE;
    public static RegistrySupplier<EntityType<CustomZombieEntity>> CAVE_ZOMBIE;
    public static RegistrySupplier<EntityType<CustomZombieEntity>> CHERRY_ZOMBIE;
    public static RegistrySupplier<EntityType<CustomZombieEntity>> DEEP_DARK_ZOMBIE;
    public static RegistrySupplier<EntityType<CustomZombieEntity>> DESERT_ZOMBIE;
    public static RegistrySupplier<EntityType<CustomZombieEntity>> DRIPSTONE_ZOMBIE;
    public static RegistrySupplier<EntityType<CustomZombieEntity>> FROZEN_ZOMBIE;
    public static RegistrySupplier<EntityType<CustomZombieEntity>> JUNGLE_ZOMBIE;
    public static RegistrySupplier<EntityType<CustomZombieEntity>> LUSH_ZOMBIE;
    public static RegistrySupplier<EntityType<CustomZombieEntity>> MANGROVE_ZOMBIE;
    public static RegistrySupplier<EntityType<CustomZombieEntity>> PALE_GARDEN_ZOMBIE;
    public static RegistrySupplier<EntityType<CustomZombieEntity>> SAVANNA_ZOMBIE;
    public static RegistrySupplier<EntityType<CustomZombieEntity>> SWAMP_ZOMBIE;
    public static RegistrySupplier<EntityType<CustomZombieEntity>> MUSHROOM_ZOMBIE;

    public static void initEntityTypes() {
        BADLANDS_ZOMBIE = registerEntityType("badlands_zombie", () -> EntityType.Builder
                .create(CustomZombieEntity::new, SpawnGroup.MONSTER)
                .setDimensions(0.6F, 1.95F)
                .build( Utils.id("badlands_zombie").toString()));

        BAMBOO_ZOMBIE = registerEntityType("bamboo_zombie", () -> EntityType.Builder
                .create(CustomZombieEntity::new, SpawnGroup.MONSTER)
                .setDimensions(0.6F, 1.95F)
                .build( Utils.id("bamboo_zombie").toString()));

        CAVE_ZOMBIE = registerEntityType("cave_zombie", () -> EntityType.Builder
                .create(CustomZombieEntity::new, SpawnGroup.MONSTER)
                .setDimensions(0.6F, 1.95F)
                .build( Utils.id("cave_zombie").toString()));

        CHERRY_ZOMBIE = registerEntityType("cherry_zombie", () -> EntityType.Builder
                .create(CustomZombieEntity::new, SpawnGroup.MONSTER)
                .setDimensions(0.6F, 1.95F)
                .build( Utils.id("cherry_zombie").toString()));

        DEEP_DARK_ZOMBIE = registerEntityType("deep_dark_zombie", () -> EntityType.Builder
                .create(CustomZombieEntity::new, SpawnGroup.MONSTER)
                .setDimensions(0.6F, 1.95F)
                .build( Utils.id("deep_dark_zombie").toString()));

        DESERT_ZOMBIE = registerEntityType("desert_zombie", () -> EntityType.Builder
                .create(CustomZombieEntity::new, SpawnGroup.MONSTER)
                .setDimensions(0.6F, 1.95F)
                .build( Utils.id("desert_zombie").toString()));

        DRIPSTONE_ZOMBIE = registerEntityType("dripstone_zombie", () -> EntityType.Builder
                .create(CustomZombieEntity::new, SpawnGroup.MONSTER)
                .setDimensions(0.6F, 1.95F)
                .build( Utils.id("dripstone_zombie").toString()));

        FROZEN_ZOMBIE = registerEntityType("frozen_zombie", () -> EntityType.Builder
                .create(CustomZombieEntity::new, SpawnGroup.MONSTER)
                .setDimensions(0.6F, 1.95F)
                .build( Utils.id("frozen_zombie").toString()));

        JUNGLE_ZOMBIE = registerEntityType("jungle_zombie", () -> EntityType.Builder
                .create(CustomZombieEntity::new, SpawnGroup.MONSTER)
                .setDimensions(0.6F, 1.95F)
                .build( Utils.id("jungle_zombie").toString()));

        LUSH_ZOMBIE = registerEntityType("lush_zombie", () -> EntityType.Builder
                .create(CustomZombieEntity::new, SpawnGroup.MONSTER)
                .setDimensions(0.6F, 1.95F)
                .build( Utils.id("lush_zombie").toString()));

        MANGROVE_ZOMBIE = registerEntityType("mangrove_zombie", () -> EntityType.Builder
                .create(CustomZombieEntity::new, SpawnGroup.MONSTER)
                .setDimensions(0.6F, 1.95F)
                .build( Utils.id("mangrove_zombie").toString()));

        PALE_GARDEN_ZOMBIE = registerEntityType("pale_garden_zombie", () -> EntityType.Builder
                .create(CustomZombieEntity::new, SpawnGroup.MONSTER)
                .setDimensions(0.6F, 1.95F)
                .build( Utils.id("pale_garden_zombie").toString()));

        SAVANNA_ZOMBIE = registerEntityType("savanna_zombie", () -> EntityType.Builder
                .create(CustomZombieEntity::new, SpawnGroup.MONSTER)
                .setDimensions(0.6F, 1.95F)
                .build( Utils.id("savanna_zombie").toString()));

        SWAMP_ZOMBIE = registerEntityType("swamp_zombie", () -> EntityType.Builder
                .create(CustomZombieEntity::new, SpawnGroup.MONSTER)
                .setDimensions(0.6F, 1.95F)
                .build( Utils.id("swamp_zombie").toString()));

        MUSHROOM_ZOMBIE = registerEntityType("mushroom_zombie", () -> EntityType.Builder
                .create(CustomZombieEntity::new, SpawnGroup.MONSTER)
                .setDimensions(0.6F, 1.95F)
                .build( Utils.id("mushroom_zombie").toString()));

        ENTITIES.register();
    }

    private static <T extends Entity> RegistrySupplier<EntityType<T>> registerEntityType(String name, Supplier<EntityType<T>> entityType) {
        return ENTITIES.register(name, entityType);
    }


    static {
        ATTRIBUTES.put(() -> BADLANDS_ZOMBIE.get(), CustomZombieEntity::createAttributes);
        ATTRIBUTES.put(() -> BAMBOO_ZOMBIE.get(), CustomZombieEntity::createAttributes);
        ATTRIBUTES.put(() -> CAVE_ZOMBIE.get(), CustomZombieEntity::createAttributes);
        ATTRIBUTES.put(() -> CHERRY_ZOMBIE.get(), CustomZombieEntity::createAttributes);
        ATTRIBUTES.put(() -> DEEP_DARK_ZOMBIE.get(), CustomZombieEntity::createAttributes);
        ATTRIBUTES.put(() -> DESERT_ZOMBIE.get(), CustomZombieEntity::createAttributes);
        ATTRIBUTES.put(() -> DRIPSTONE_ZOMBIE.get(), CustomZombieEntity::createAttributes);
        ATTRIBUTES.put(() -> FROZEN_ZOMBIE.get(), CustomZombieEntity::createAttributes);
        ATTRIBUTES.put(() -> JUNGLE_ZOMBIE.get(), CustomZombieEntity::createAttributes);
        ATTRIBUTES.put(() -> LUSH_ZOMBIE.get(), CustomZombieEntity::createAttributes);
        ATTRIBUTES.put(() -> MANGROVE_ZOMBIE.get(), CustomZombieEntity::createAttributes);
        ATTRIBUTES.put(() -> PALE_GARDEN_ZOMBIE.get(), CustomZombieEntity::createAttributes);
        ATTRIBUTES.put(() -> SAVANNA_ZOMBIE.get(), CustomZombieEntity::createAttributes);
        ATTRIBUTES.put(() -> SWAMP_ZOMBIE.get(), CustomZombieEntity::createAttributes);
        ATTRIBUTES.put(() -> MUSHROOM_ZOMBIE.get(), CustomZombieEntity::createAttributes);
    }


}