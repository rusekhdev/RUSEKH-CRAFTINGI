package dev.rusekh.craftingi.utils;

import org.bukkit.*;

public class ChatUtil
{
    public static String fixColor(final String b) {
        return ChatColor.translateAlternateColorCodes('&', b.replace(">>", "»").replace("<<", "«")).replace("%tag", "§c§lEPICMC.GA  §8»");
    }
}
