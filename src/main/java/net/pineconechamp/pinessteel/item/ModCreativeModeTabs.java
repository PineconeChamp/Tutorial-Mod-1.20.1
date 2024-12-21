package net.pineconechamp.pinessteel.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pineconechamp.pinessteel.PinesSteel;
import net.pineconechamp.pinessteel.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PinesSteel.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PINES_STEEL_TAB = CREATIVE_MODE_TABS.register("pines_steel_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STEEL.get()))
                    .title(Component.translatable("creativetab.pines_steel_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.STEEL.get());
                        output.accept(ModItems.STEELSLAG.get());
                        output.accept(ModBlocks.STEEL_BLOCK.get());
                        output.accept(ModBlocks.HEAVY_STEEL_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
