package com.orca.dungeonbound.common.item;

import com.orca.dungeonbound.DungeonBound;
import com.orca.dungeonbound.common.entity.DBEntities;
import com.orca.dungeonbound.common.entity.custom.KoboldEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DBItems {

    public static final DeferredRegister<Item> ITEM_TYPES =
            DeferredRegister.create(ForgeRegistries.ITEMS, DungeonBound.MODID);

    public static final RegistryObject<Item> KOBOLD_SPAWN_EGG = ITEM_TYPES.register("kobold_spawn_egg",
            ()-> new ForgeSpawnEggItem(DBEntities.KOBOLD, 0xd2463b, 0xf8b87b, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEM_TYPES.register(eventBus);
    }
}
