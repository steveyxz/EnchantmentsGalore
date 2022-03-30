package me.partlysunny.enchants.movement;

import io.papermc.paper.enchantments.EnchantmentRarity;
import me.partlysunny.EnchantmentsGalore;
import me.partlysunny.Util;
import me.partlysunny.enchants.Enchant;
import me.partlysunny.enchants.EnchantmentManager;
import me.partlysunny.enchants.Enchantments;
import me.partlysunny.items.CustomItem;
import me.partlysunny.items.ItemManager;
import me.partlysunny.recipeManager.CustomRecipe;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.entity.EntityCategory;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class Speedy extends Enchant {
    public Speedy() {
        super("speedy");
    }

    public @NotNull String getName() {
        return "Speedy";
    }

    public int getMaxLevel() {
        return 3;
    }

    public int getStartLevel() {
        return 1;
    }

    public @NotNull EnchantmentTarget getItemTarget() {
        return EnchantmentTarget.ARMOR_FEET;
    }

    public boolean isTreasure() {
        return false;
    }

    public boolean isCursed() {
        return false;
    }

    public boolean conflictsWith(@NotNull Enchantment enchantment) {
        return false;
    }

    public boolean canEnchantItem(@NotNull ItemStack itemStack) {
        return itemStack.getType().toString().toLowerCase().contains("_boots");
    }

    public @NotNull Component displayName(int i) {
        return Component.empty().content("Speedy " + Util.integerToRoman(i));
    }

    public boolean isTradeable() {
        return true;
    }

    public boolean isDiscoverable() {
        return true;
    }

    public @NotNull EnchantmentRarity getRarity() {
        return EnchantmentRarity.RARE;
    }

    public float getDamageIncrease(int i, @NotNull EntityCategory entityCategory) {
        return 0;
    }

    public @NotNull Set<EquipmentSlot> getActiveSlots() {
        return Set.of(EquipmentSlot.FEET);
    }

    public @NotNull String translationKey() {
        return "";
    }

    protected CustomRecipe getRecipe() {
        ItemStack i = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta m = (EnchantmentStorageMeta) i.getItemMeta();
        m.addStoredEnchant(this, 1, true);
        i.setItemMeta(m);
        CustomRecipe r = new CustomRecipe(i, "speedy");
        r.shape("ababcbaba");
        r.setIngredient('a', new ItemStack(Material.LAPIS_BLOCK));
        r.setIngredient('b', new ItemStack(Material.SUGAR));
        r.setIngredient('c', ItemManager.getItem(CustomItem.CORE_T1));
        return r;
    }
}
