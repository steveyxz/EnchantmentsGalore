package me.partlysunny.commands;

import me.partlysunny.items.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GiveCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (!(commandSender instanceof Player p)) return true;
        if (strings.length == 0) {
            p.sendMessage(ChatColor.RED + "lmao give an argument");
            return true;
        }
        int i = 1;
        if (strings.length > 1) {
            try {
                i = Integer.parseInt(strings[2]);
            } catch (NumberFormatException e) {
                p.sendMessage(ChatColor.RED + "enter a valid number next time");
            }
        }
        if (ItemManager.getItem(strings[1]) != null) {
            p.getInventory().addItem(ItemManager.getItem(strings[1]).clone());
            p.sendMessage(ChatColor.GREEN + "gave you " + i + " " + strings[1]);
        } else {
            p.sendMessage(ChatColor.RED + "not a valid item sry");
        }
        return true;
    }
}
