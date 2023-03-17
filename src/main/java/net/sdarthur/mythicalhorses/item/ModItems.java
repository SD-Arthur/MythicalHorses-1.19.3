package net.sdarthur.mythicalhorses.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sdarthur.mythicalhorses.MythicalHorses;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MythicalHorses.MOD_ID);

    public static final RegistryObject<Item> PET_AMULET = ITEMS.register("pet_amulet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HEART_OF_UNDEAD = ITEMS.register("heart_of_undead",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HEART_OF_FIRE = ITEMS.register("heart_of_fire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HEART_OF_DARKNESS = ITEMS.register("heart_of_darkness",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
