package com.orca.dungeonbound;

import com.orca.dungeonbound.common.item.DBItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class DBCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DungeonBound.MODID);

    public static final RegistryObject<CreativeModeTab> MARVELOUS_MENAGERIE_TAB =
            CREATIVE_MODE_TABS.register("dungeonbound_tab", ()-> CreativeModeTab.builder().icon(() -> new ItemStack(DBItems.KOBOLD_SPAWN_EGG.get()))
                    .title(Component.translatable("creativetab.dungeonbound_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(DBItems.KOBOLD_SPAWN_EGG.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
