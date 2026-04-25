package com.nucleararmory.init;

import com.nucleararmory.NuclearArmory;
import com.nucleararmory.items.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NuclearArmory.MOD_ID);

    // 枪械
    public static final RegistryObject<Item> PISTOL = ITEMS.register("pistol", () ->
        new GunItem(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON), 6, 15));

    public static final RegistryObject<Item> RIFLE = ITEMS.register("rifle", () ->
        new GunItem(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON), 5, 20));

    public static final RegistryObject<Item> SHOTGUN = ITEMS.register("shotgun", () ->
        new GunItem(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.RARE), 4, 12));

    public static final RegistryObject<Item> SNIPER = ITEMS.register("sniper", () ->
        new GunItem(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.RARE), 3, 40));

    // 弹药
    public static final RegistryObject<Item> AMMO = ITEMS.register("ammo", () ->
        new Item(new Item.Properties().stacksTo(64)));

    // 核弹
    public static final RegistryObject<Item> NUCLEAR_BOMB = ITEMS.register("nuclear_bomb", () ->
        new NuclearBombItem(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC)));

    // 铀锭
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", () ->
        new Item(new Item.Properties().stacksTo(64)));

    // 钚锭
    public static final RegistryObject<Item> PLUTONIUM_INGOT = ITEMS.register("plutonium_ingot", () ->
        new Item(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC)));

    // 创造模式标签页
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NuclearArmory.MOD_ID);
    public static final RegistryObject<CreativeModeTab> NUCLEAR_ARMORY_TAB = TABS.register("nucleararmory", () -> CreativeModeTab.builder()
            .title(Component.literal("Nuclear Armory"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> new ItemStack(NUCLEAR_BOMB.get()))
            .displayItems((parameters, output) -> {
                output.accept(PISTOL.get());
                output.accept(RIFLE.get());
                output.accept(SHOTGUN.get());
                output.accept(SNIPER.get());
                output.accept(AMMO.get());
                output.accept(NUCLEAR_BOMB.get());
                output.accept(URANIUM_INGOT.get());
                output.accept(PLUTONIUM_INGOT.get());
            })
            .build());
}
