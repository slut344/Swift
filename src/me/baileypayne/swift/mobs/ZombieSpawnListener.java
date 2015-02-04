package me.baileypayne.swift.mobs;

import me.baileypayne.swift.MasterListener;
import me.baileypayne.swift.Swift;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

/**
 * Created by Bailey on 28/01/2015.
 */
public class ZombieSpawnListener extends MasterListener {

    Random r;

    public ZombieSpawnListener(Swift pl){
        super(pl);
    }

    @EventHandler
    public void onZombieSpawnEvent(CreatureSpawnEvent e){
        r = new Random();
        Entity entity = e.getEntity();
        if("ZOMBIE".equals(entity.getType().toString())){
            Zombie barbarianZombie = (Zombie) e.getEntity();
            Zombie goldenZombie = (Zombie) e.getEntity();
            Zombie loneZombie = (Zombie) e.getEntity();
            //barbarian zombie
            if(r.nextFloat()< plugin.getConfig().getDouble("barbarianZombiePercent")){
                barbarianZombie.setCustomName(ChatColor.BLACK + "Barbarian Soldier");
                barbarianZombie.setCustomNameVisible(true);
                barbarianZombie.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
                barbarianZombie.getEquipment().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
                barbarianZombie.getEquipment().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
                barbarianZombie.getEquipment().setBoots(new ItemStack(Material.LEATHER_BOOTS));
                barbarianZombie.getEquipment().setItemInHand(new ItemStack(Material.IRON_AXE));
                barbarianZombie.setMaxHealth(plugin.getConfig().getInt("barbarianSoldierHealth"));
                barbarianZombie.setHealth(plugin.getConfig().getInt("barbarianSoldierHealth"));
            }
            //gold zombie
            if(r.nextFloat()< plugin.getConfig().getDouble("goldZombiePercent")){
                goldenZombie.setCustomName(ChatColor.BLACK + "Golden Soldier");
                goldenZombie.setCustomNameVisible(true);
                goldenZombie.getEquipment().setHelmet(new ItemStack(Material.GOLD_HELMET));
                goldenZombie.getEquipment().setChestplate(new ItemStack(Material.GOLD_CHESTPLATE));
                goldenZombie.getEquipment().setLeggings(new ItemStack(Material.GOLD_LEGGINGS));
                goldenZombie.getEquipment().setBoots(new ItemStack(Material.GOLD_BOOTS));
                goldenZombie.getEquipment().setItemInHand(new ItemStack(Material.GOLD_SWORD));
                goldenZombie.setMaxHealth(plugin.getConfig().getInt("goldSoldierHealth"));
                goldenZombie.setHealth(plugin.getConfig().getInt("goldSoldierHealth"));
            }
            //lone zombie
            if(r.nextFloat()< plugin.getConfig().getDouble("loneZombiePercent")){
                loneZombie.setCustomName(ChatColor.BLACK + "Lone Knight");
                loneZombie.setCustomNameVisible(true);
                loneZombie.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
                loneZombie.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
                loneZombie.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
                loneZombie.getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
                loneZombie.getEquipment().setItemInHand(new ItemStack(Material.DIAMOND_AXE));
                loneZombie.setMaxHealth(plugin.getConfig().getInt("loneSoldierHealth"));
                loneZombie.setHealth(plugin.getConfig().getInt("loneSoldierHealth"));
            }

        }
    }
}
