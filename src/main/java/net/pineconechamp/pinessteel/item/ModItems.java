package net.pineconechamp.pinessteel.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pineconechamp.pinessteel.PinesSteel;
import net.pineconechamp.pinessteel.item.custom.MetalDetectorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PinesSteel.MOD_ID);

    public static final RegistryObject<Item> STEEL = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEELSLAG = ITEMS.register("steel_slag",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_CHEESE = ITEMS.register("raw_cheese",
            () -> new Item(new Item.Properties().food(ModFoods.CHEESE)));

    public static final  RegistryObject<Item> COBALT = ITEMS.register("cobalt_ingot",
            () -> new Item(new Item.Properties()));

    public static final  RegistryObject<Item> RAW_COBALT = ITEMS.register("raw_cobalt",
            () -> new Item(new Item.Properties()));

    public static final  RegistryObject<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium",
            () -> new Item(new Item.Properties()));

    public static final  RegistryObject<Item> ALUMINIUM = ITEMS.register("aluminium_ingot",
            () -> new Item(new Item.Properties()));

    public static final  RegistryObject<Item> RAW_LITHIUM = ITEMS.register("raw_lithium",
            () -> new Item(new Item.Properties()));

    public static final  RegistryObject<Item> RAW_SULPHUR = ITEMS.register("raw_sulphur",
            () -> new Item(new Item.Properties()));

    public static final  RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties()));

    public static final  RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(50)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

