package dev.rusekh.craftingi.listeners;

import dev.rusekh.craftingi.utils.ChatUtil;
import dev.rusekh.craftingi.utils.CraftingiUtil;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener implements Listener
{
    @EventHandler
    public void click(final InventoryClickEvent e) {
        final Player p = (Player)e.getWhoClicked();
        if (e.getInventory().getName().equalsIgnoreCase(ChatUtil.fixColor("%tag &cCRAFTINGI"))) {
            e.setCancelled(true);
            e.setResult(Event.Result.DENY);
            final int slot = e.getSlot();
            if (slot == 1) {
                CraftingiUtil.openStoniarkaMenu(p);
                return;
            }
        }
    }
}
