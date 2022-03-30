package me.partlysunny;

import me.partlysunny.commands.GiveCommand;
import me.partlysunny.enchants.EnchantmentManager;
import me.partlysunny.enchants.movement.WalkSpeedUpdater;
import me.partlysunny.items.ItemManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class EnchantmentsGalore extends JavaPlugin {
    @Override
    public void onEnable() {
        ItemManager.createInstances();
        EnchantmentManager.createInstances();
        initCommands();
        WalkSpeedUpdater.start();
    }

    private void initCommands() {
        Objects.requireNonNull(getCommand("ecgive")).setExecutor(new GiveCommand());
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
