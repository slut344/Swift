package me.baileypayne.swift;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * Created by Bailey on 01/12/2014.
 */
public class CustomItems {

    //oblivion
    public static ItemStack oblivionHelmet = new ItemStack(Material.GOLD_HELMET);
    public static ItemStack oblivionChest = new ItemStack(Material.GOLD_CHESTPLATE);
    public static ItemStack oblivionLeg = new ItemStack(Material.GOLD_LEGGINGS);
    public static ItemStack oblivionBoots = new ItemStack(Material.GOLD_BOOTS);
    public static ItemStack oblivionSword = new ItemStack(Material.GOLD_SWORD);
    public static ItemStack oblivionAxe = new ItemStack(Material.GOLD_AXE);
    public static ItemStack oblivionBow = new ItemStack(Material.BOW);

    //other
    public static ItemStack cyraax = new ItemStack(Material.STONE_SWORD);
    public static ItemStack atticus = new ItemStack(Material.BOW);
    public static ItemStack sphyax = new ItemStack(Material.STONE_AXE);

    //misc
    public static ItemStack endeyes = new ItemStack(Material.EYE_OF_ENDER);
    public static ItemStack bonehuman = new ItemStack(Material.BLAZE_ROD);
    public static ItemStack septims = new ItemStack(Material.GOLD_NUGGET);

    public static void init()
    {
        //Oblivion helmet
        oblivionHelmet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        oblivionHelmet.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 2);
        oblivionHelmet.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);
        oblivionHelmet.addUnsafeEnchantment(Enchantment.WATER_WORKER, 2);
        oblivionHelmet.addUnsafeEnchantment(Enchantment.OXYGEN, 1);
        oblivionHelmet.addUnsafeEnchantment(Enchantment.THORNS, 2);
        oblivionHelmet.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
        ItemMeta oblivionHelmetm = oblivionHelmet.getItemMeta();
        oblivionHelmetm.setDisplayName(ChatColor.DARK_PURPLE+"Oblivion Helmet");
        oblivionHelmet.setItemMeta(oblivionHelmetm);

        //oblivion chest
        oblivionChest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        oblivionChest.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 3);
        oblivionChest.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 3);
        oblivionChest.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 3);
        oblivionChest.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
        ItemMeta oblivionChestm = oblivionChest.getItemMeta();
        oblivionChestm.setDisplayName(ChatColor.DARK_PURPLE+"Oblivion Chestplate");
        oblivionChest.setItemMeta(oblivionChestm);


        oblivionLeg.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        oblivionLeg.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 2);
        oblivionLeg.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);
        oblivionLeg.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 2);
        oblivionLeg.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
        ItemMeta oblivionLegm = oblivionLeg.getItemMeta();
        oblivionLegm.setDisplayName(ChatColor.DARK_PURPLE+"Oblivion Leggings");
        oblivionLeg.setItemMeta(oblivionLegm);

        oblivionBoots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        oblivionBoots.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 2);
        oblivionBoots.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);
        oblivionBoots.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 2);
        oblivionBoots.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
        ItemMeta oblivionBootsm = oblivionBoots.getItemMeta();
        oblivionBootsm.setDisplayName(ChatColor.DARK_PURPLE+"Oblivion Boots");
        oblivionBoots.setItemMeta(oblivionBootsm);


        oblivionSword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 5);
        oblivionSword.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 1);
        ItemMeta oblivionSwordm = oblivionSword.getItemMeta();
        oblivionSwordm.setDisplayName(ChatColor.DARK_PURPLE+"Oblivion Sword");
        oblivionSword.setItemMeta(oblivionSwordm);

        oblivionAxe.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 5);
        oblivionAxe.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 1);
        ItemMeta oblivionAxem = oblivionAxe.getItemMeta();
        oblivionAxem.setDisplayName(ChatColor.DARK_PURPLE+"Oblivion Axe");
        oblivionAxe.setItemMeta(oblivionAxem);

        oblivionBow.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 4);
        oblivionBow.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 1);
        ItemMeta oblivionBowm = oblivionBow.getItemMeta();
        oblivionBowm.setDisplayName(ChatColor.DARK_PURPLE+"Oblivion Bow");
        oblivionBow.setItemMeta(oblivionBowm);


        cyraax.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 8);
        cyraax.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 3);
        ItemMeta cyraaxm = cyraax.getItemMeta();
        cyraaxm.setDisplayName(ChatColor.DARK_RED+"Cyraax the Mourner");
        cyraax.setItemMeta(cyraaxm);

        sphyax.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 8);
        sphyax.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 3);
        ItemMeta sphyaxm = sphyax.getItemMeta();
        sphyaxm.setDisplayName(ChatColor.DARK_RED+"Sphyax the Abrupt");

        atticus.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 6);
        atticus.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 2);
        atticus.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
        ItemMeta atticusm = atticus.getItemMeta();
        atticusm.setDisplayName(ChatColor.DARK_RED+"Atticus the Painless");
        atticus.setItemMeta(atticusm);

        ItemMeta endeyesm = endeyes.getItemMeta();
        endeyesm.setDisplayName(ChatColor.DARK_RED+"End of all Eyes");
        endeyes.setItemMeta(endeyesm);

        ItemMeta bonehumanm = bonehuman.getItemMeta();
        bonehumanm.setDisplayName(ChatColor.DARK_RED+"Bone of all Humans");

        ItemMeta septimsm = septims.getItemMeta();
        septimsm.setDisplayName(ChatColor.GOLD + "Septims");
        septims.setItemMeta(septimsm);

    }

}
