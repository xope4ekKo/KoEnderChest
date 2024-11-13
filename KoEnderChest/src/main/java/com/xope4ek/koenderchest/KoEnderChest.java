package com.xope4ek.koenderchest;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class KoEnderChest extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("koec").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player && command.getName().toLowerCase().equals("koec")){
            ((Player) sender).openInventory(((Player) sender).getEnderChest());
        }

        return true;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
