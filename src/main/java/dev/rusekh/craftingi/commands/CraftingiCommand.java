package dev.rusekh.craftingi.commands;

import dev.rusekh.craftingi.utils.ChatUtil;
import dev.rusekh.craftingi.utils.CraftingiUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CraftingiCommand implements CommandExecutor
{
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(ChatUtil.fixColor("%tag Ta komenda jest in-game"));
        }
        else {
            final Player p = (Player)sender;
            CraftingiUtil.gui(p);
        }
        return false;
    }
}
