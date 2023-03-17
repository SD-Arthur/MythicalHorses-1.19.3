package net.sdarthur.mythicalhorses.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sdarthur.mythicalhorses.MythicalHorses;

@Mod.EventBusSubscriber(modid = MythicalHorses.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab MYTHICAL_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        MYTHICAL_TAB = event.registerCreativeModeTab(new ResourceLocation(MythicalHorses.MOD_ID, "mythical_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.PET_AMULET.get()))
                        .title(Component.translatable("creativemodetab.mythical_tab")));
    }
}
