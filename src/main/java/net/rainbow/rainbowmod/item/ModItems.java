package net.rainbow.rainbowmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rainbow.rainbowmod.RainbowMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RainbowMod.MOD_ID);

    public final RegistryObject<Item> RAINBOW = ITEMS.register("rainbow",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
