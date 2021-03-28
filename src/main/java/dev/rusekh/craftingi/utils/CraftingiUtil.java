package dev.rusekh.craftingi.utils;

import dev.rusekh.craftingi.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class CraftingiUtil
{
    private Main plugin;

    public static void gui(final Player p) {
        final Inventory inv = Bukkit.createInventory((InventoryHolder)p, 9, ChatUtil.fixColor("%tag &cCRAFTINGI"));
        final ItemBuilder stoniarka = new ItemBuilder(Material.ENDER_STONE).setTitle(ChatUtil.fixColor("&8>> &cStoniarka")).addEnchantment(Enchantment.KNOCKBACK, 10).addLore(ChatUtil.fixColor("&8>> &fNacisnij aby zobaczyc"));
        final ItemBuilder boyfarmer = new ItemBuilder(Material.OBSIDIAN).setTitle(ChatUtil.fixColor("&8>> &cBoyFarmer")).addEnchantment(Enchantment.KNOCKBACK, 10).addLore(ChatUtil.fixColor("&8>> &fNacisnij aby zobaczyc"));
        final ItemBuilder kopaczfosy = new ItemBuilder(Material.DIAMOND_ORE).setTitle(ChatUtil.fixColor("&8>> &cKopaczFosy")).addEnchantment(Enchantment.KNOCKBACK, 10).addLore(ChatUtil.fixColor("&8>> &fNacisnij aby zobaczyc"));
        final ItemBuilder sandfarmer = new ItemBuilder(Material.SAND).setTitle(ChatUtil.fixColor("&8>> &cSandFarmer")).addEnchantment(Enchantment.KNOCKBACK, 10).addLore(ChatUtil.fixColor("&8>> &fNacisnij aby zobaczyc"));
        final ItemBuilder rzucak = new ItemBuilder(Material.TNT).setTitle(ChatUtil.fixColor("&8>> &cRzucaneTnT")).addEnchantment(Enchantment.KNOCKBACK, 10).addLore(ChatUtil.fixColor("&8>> &fNacisnij aby zobaczyc"));
        final ItemBuilder ec = new ItemBuilder(Material.ENDER_CHEST).setTitle(ChatUtil.fixColor("&8>> &cEnderChest")).addEnchantment(Enchantment.KNOCKBACK, 10).addLore(ChatUtil.fixColor("&8>> &fNacisnij aby zobaczyc"));
        final ItemBuilder szklo = new ItemBuilder(Material.STAINED_GLASS_PANE, (short)4).setTitle(ChatUtil.fixColor("&8#"));
        inv.setItem(0, szklo.build());
        inv.setItem(1, stoniarka.build());
        inv.setItem(2, boyfarmer.build());
        inv.setItem(3, kopaczfosy.build());
        inv.setItem(4, sandfarmer.build());
        inv.setItem(5, rzucak.build());
        inv.setItem(6, ec.build());
        inv.setItem(7, szklo.build());
        inv.setItem(8, szklo.build());
        p.openInventory(inv);
        }



    public static void openStoniarkaMenu(final Player p) {
        final Inventory inv = Bukkit.createInventory((InventoryHolder)p, 54, ChatUtil.fixColor("&7MENU &8| &cGenerator Kamienia"));
        //final ItemBuilder szklo = new ItemBuilder(Material.STAINED_GLASS_PANE, (short)4).setTitle(ChatUtil.fixColor("&8#"));
        final ItemBuilder diamond = new ItemBuilder(Material.DIAMOND);
        final ItemBuilder kilof = new ItemBuilder(Material.DIAMOND_PICKAXE);
        final ItemBuilder stoniarka = new ItemBuilder(Material.ENDER_STONE);
        inv.setItem(54, diamond.build());
        inv.setItem(11, diamond.build());
        inv.setItem(12, diamond.build());
        inv.setItem(19, diamond.build());
        inv.setItem(20, kilof.build());
        inv.setItem(21, diamond.build());
        inv.setItem(28, diamond.build());
        inv.setItem(29, diamond.build());
        inv.setItem(30, diamond.build());
        inv.setItem(27, stoniarka.build());
        p.openInventory(inv);
    }
}
