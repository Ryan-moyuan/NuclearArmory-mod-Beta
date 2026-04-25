package com.nucleararmory.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class GunItem extends Item {
    private final int damage;
    private final int range;

    public GunItem(Properties properties, int damage, int range) {
        super(properties);
        this.damage = damage;
        this.range = range;
    }

    public int getDamage() {
        return damage;
    }

    public int getRange() {
        return range;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.BOW;
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 20;
    }
}
