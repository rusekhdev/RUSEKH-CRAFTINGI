package dev.rusekh.craftingi;

import dev.rusekh.craftingi.commands.CraftingiCommand;
import dev.rusekh.craftingi.listeners.InventoryClickListener;
import org.bukkit.event.*;
import org.bukkit.plugin.*;
import org.bukkit.command.*;
import org.bukkit.*;
import org.bukkit.plugin.java.*;

public class Main extends JavaPlugin
{
    public void onEnable() {
        this.getCommand("crafting").setExecutor((CommandExecutor) new CraftingiCommand());
        Bukkit.getPluginManager().registerEvents((Listener) new InventoryClickListener(), (Plugin) this);
        Bukkit.broadcastMessage("RUSEKH-CRAFTINGS Wczytano w " + System.currentTimeMillis() + " ms");
    }
}
