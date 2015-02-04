package me.baileypayne.swift.mobs;

import me.baileypayne.swift.MasterListener;
import me.baileypayne.swift.Swift;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

/**
 * Created by Bailey on 30/01/2015.
 */
public class SkeletonSpawnListener extends MasterListener {

    Random r;

    public SkeletonSpawnListener(Swift pl){
        super(pl);
    }

    @EventHandler
    public void onSkeletonSpawnEvent(CreatureSpawnEvent e){
        r = new Random();
        Entity entity = e.getEntity();
        if("SKELETON".equals(entity.getType().toString())){
            Skeleton barbarianSkeleton = (Skeleton) e.getEntity();
            Skeleton goldenSkeleton = (Skeleton) e.getEntity();
            Skeleton loneSkeleton = (Skeleton) e.getEntity();
            //barbarian
            if(r.nextFloat()< plugin.getConfig().getDouble("barbarianZombiePercent")){
                barbarianSkeleton.setCustomName(ChatColor.BLACK + "Barbarian Archer");
                barbarianSkeleton.setCustomNameVisible(true);
                barbarianSkeleton.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
                barbarianSkeleton.getEquipment().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
                barbarianSkeleton.getEquipment().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
                barbarianSkeleton.getEquipment().setBoots(new ItemStack(Material.LEATHER_BOOTS));
                barbarianSkeleton.setMaxHealth(plugin.getConfig().getInt("barbarianSoldierHealth"));
                barbarianSkeleton.setHealth(plugin.getConfig().getInt("barbarianSoldierHealth"));
            }
            //gold
            if(r.nextFloat()< plugin.getConfig().getDouble("goldZombiePercent")){
                goldenSkeleton.setCustomName(ChatColor.BLACK + "Golden Archer");
                goldenSkeleton.setCustomNameVisible(true);
                goldenSkeleton.getEquipment().setHelmet(new ItemStack(Material.GOLD_HELMET));
                goldenSkeleton.getEquipment().setChestplate(new ItemStack(Material.GOLD_CHESTPLATE));
                goldenSkeleton.getEquipment().setLeggings(new ItemStack(Material.GOLD_LEGGINGS));
                goldenSkeleton.getEquipment().setBoots(new ItemStack(Material.GOLD_BOOTS));
                goldenSkeleton.setMaxHealth(plugin.getConfig().getInt("goldSoldierHealth"));
                goldenSkeleton.setHealth(plugin.getConfig().getInt("goldSoldierHealth"));
            }
            //lone
            if(r.nextFloat()< plugin.getConfig().getDouble("loneZombiePercent")){
                loneSkeleton.setCustomName(ChatColor.BLACK + "Lone Archer");
                loneSkeleton.setCustomNameVisible(true);
                loneSkeleton.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
                loneSkeleton.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
                loneSkeleton.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
                loneSkeleton.getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
                loneSkeleton.setMaxHealth(plugin.getConfig().getInt("loneSoldierHealth"));
                loneSkeleton.setHealth(plugin.getConfig().getInt("loneSoldierHealth"));
            }

        }
    }
}
