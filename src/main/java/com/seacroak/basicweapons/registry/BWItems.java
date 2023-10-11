package com.seacroak.basicweapons.registry;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

import com.seacroak.basicweapons.item.ClubItem;
import com.seacroak.basicweapons.item.DaggerItem;
import com.seacroak.basicweapons.item.HammerItem;
import com.seacroak.basicweapons.item.QuarterstaffItem;
import com.seacroak.basicweapons.item.SpearItem;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;

public class BWItems {
    public static final int daggerDamage = 1;
    public static final float daggerSpeed = -2.0f;
    public static final int hammerDamage = 7;
    public static final float hammerSpeed = -3.4f;
    public static final int clubDamage = 5;
    public static final float clubSpeed = -3.0f;
    public static final int spearDamage = 2;
    public static final float spearSpeed = -2.8f;
    public static final int quarterstaffDamage = 1;
    public static final float quarterstaffSpeed = -2.3f;

    public static List<ItemInfo> items = new LinkedList<>();

    public static void init() {
        /* Daggers */
        items.add(new ItemInfo("dagger", "wooden_dagger",
                () -> new DaggerItem(ToolMaterials.WOOD, daggerDamage, daggerSpeed, new Item.Settings())));
        items.add(new ItemInfo("dagger", "stone_dagger",
                () -> new DaggerItem(ToolMaterials.STONE, daggerDamage, daggerSpeed, new Item.Settings())));
        items.add(new ItemInfo("dagger", "iron_dagger",
                () -> new DaggerItem(ToolMaterials.IRON, daggerDamage, daggerSpeed, new Item.Settings())));
        items.add(new ItemInfo("dagger", "golden_dagger",
                () -> new DaggerItem(ToolMaterials.GOLD, daggerDamage - 1, daggerSpeed + 1, new Item.Settings())));
        items.add(new ItemInfo("dagger", "bonesteel_dagger",
                () -> new DaggerItem(ToolMaterials.DIAMOND, daggerDamage, daggerSpeed, new Item.Settings())));
        /* Hammers */
        items.add(new ItemInfo("hammer", "wooden_hammer",
                () -> new HammerItem(ToolMaterials.WOOD, hammerDamage - 6, hammerSpeed + 0.4f, new Item.Settings())));
        items.add(new ItemInfo("hammer", "stone_hammer",
                () -> new HammerItem(ToolMaterials.STONE, hammerDamage - 3, hammerSpeed + 0.2f, new Item.Settings())));
        items.add(new ItemInfo("hammer", "iron_hammer",
                () -> new HammerItem(ToolMaterials.IRON, hammerDamage, hammerSpeed - 0.1f, new Item.Settings())));
        items.add(new ItemInfo("hammer", "golden_hammer",
                () -> new HammerItem(ToolMaterials.GOLD, hammerDamage - 3, hammerSpeed, new Item.Settings())));
        items.add(new ItemInfo("hammer", "bonesteel_hammer",
                () -> new HammerItem(ToolMaterials.DIAMOND, hammerDamage - 1, hammerSpeed, new Item.Settings())));
        /* Batons */
        items.add(new ItemInfo("club", "wooden_club",
                () -> new ClubItem(ToolMaterials.WOOD, clubDamage, clubSpeed, new Item.Settings())));
        /* Spears */
        items.add(new ItemInfo("spear", "wooden_spear",
                () -> new SpearItem(ToolMaterials.WOOD, spearDamage, spearSpeed, new Item.Settings())));
        items.add(new ItemInfo("spear", "stone_spear",
                () -> new SpearItem(ToolMaterials.STONE, spearDamage, spearSpeed, new Item.Settings())));
        items.add(new ItemInfo("spear", "iron_spear",
                () -> new SpearItem(ToolMaterials.IRON, spearDamage, spearSpeed, new Item.Settings())));
        items.add(new ItemInfo("spear", "golden_spear",
                () -> new SpearItem(ToolMaterials.GOLD, spearDamage, spearSpeed, new Item.Settings())));
        items.add(new ItemInfo("spear", "bonesteel_spear",
                () -> new SpearItem(ToolMaterials.DIAMOND, spearDamage, spearSpeed, new Item.Settings())));
        /* Quarterstaves */
        items.add(new ItemInfo("quarterstaff", "wooden_quarterstaff",
                () -> new QuarterstaffItem(ToolMaterials.WOOD, quarterstaffDamage, quarterstaffSpeed,
                        new Item.Settings())));
        items.add(new ItemInfo("quarterstaff", "stone_quarterstaff",
                () -> new QuarterstaffItem(ToolMaterials.STONE, quarterstaffDamage, quarterstaffSpeed,
                        new Item.Settings())));
        items.add(new ItemInfo("quarterstaff", "iron_quarterstaff",
                () -> new QuarterstaffItem(ToolMaterials.IRON, quarterstaffDamage, quarterstaffSpeed,
                        new Item.Settings())));
        items.add(new ItemInfo("quarterstaff", "golden_quarterstaff",
                () -> new QuarterstaffItem(ToolMaterials.GOLD, quarterstaffDamage, quarterstaffSpeed,
                        new Item.Settings())));
        items.add(new ItemInfo("quarterstaff", "bonesteel_quarterstaff",
                () -> new QuarterstaffItem(ToolMaterials.DIAMOND, quarterstaffDamage, quarterstaffSpeed,
                        new Item.Settings())));

    }

    /***
     * This class holds information about all items.
     * It is accessed by forge & fabric methods
     * for automatic registration
     ***/
    public static class ItemInfo {
        public final String weaponType;
        public final String name;
        public final Supplier<Item> itemSupplier;

        public ItemInfo(String weaponType, String name, Supplier<Item> itemSupplier) {
            this.weaponType = weaponType;
            this.name = name;
            this.itemSupplier = itemSupplier;
        }
    }

}
