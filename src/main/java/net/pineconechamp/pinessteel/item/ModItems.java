package net.pineconechamp.pinessteel.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pineconechamp.pinessteel.PinesSteel;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PinesSteel.MOD_ID);

    public static final RegistryObject<Item> STEEL = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static  final  RegistryObject<Item> STEELSLAG = ITEMS.register("steel_slag",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

