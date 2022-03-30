package me.partlysunny.enchants.movement;

import me.partlysunny.EnchantmentsGalore;
import me.partlysunny.enchants.EnchantmentManager;
import me.partlysunny.enchants.Enchantments;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class WalkSpeedUpdater {

    public static void start() {
        JavaPlugin p = JavaPlugin.getPlugin(EnchantmentsGalore.class);
        Bukkit.getScheduler().runTaskTimer(
                p,
                () -> {
                    for (Player player : p.getServer().getOnlinePlayers()) {
                        player.setWalkSpeed(0.2f);
                        ItemStack item = player.getInventory().getBoots();
                        if (item != null) {
                            if (EnchantmentManager.doesItemHaveEnchant(item, Enchantments.SPEEDY)) {
                                int i = EnchantmentManager.getEnchantLevel(item, Enchantments.SPEEDY);
                                player.setWalkSpeed(player.getWalkSpeed() + 0.2f * (1 + i * 0.1f));
                            }
                        }
                    }
                },
                0,
                10
        );
    }

}
