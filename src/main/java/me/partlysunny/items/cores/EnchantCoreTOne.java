package me.partlysunny.items.cores;

import de.tr7zw.nbtapi.NBTItem;
import me.partlysunny.items.CustomItemBuilder;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EnchantCoreTOne extends CustomItemBuilder {
    @Override
    public ItemStack build() {
        ItemStack i = new ItemStack(Material.HEART_OF_THE_SEA);
        NBTItem nbti = new NBTItem(i);
        nbti.setString("custom_id", "enchantcoret1");
        i.addUnsafeEnchantment(Enchantment.LUCK, 1);
        i.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ItemMeta itemMeta = i.getItemMeta();
        itemMeta.setUnbreakable(true);
        itemMeta.displayName(Component.text(ChatColor.BLUE + "Enchant Core Tier 1"));
        i.setItemMeta(itemMeta);
        return null;
    }
}
