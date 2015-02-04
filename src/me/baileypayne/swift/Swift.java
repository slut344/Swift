

package me.baileypayne.swift;

import me.baileypayne.swift.mobs.SkeletonSpawnListener;
import me.baileypayne.swift.mobs.ZombieSpawnListener;
import me.baileypayne.swift.settings.DarkNights;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Bailey
 */
public class Swift extends JavaPlugin {

    public Swift plugin;

    @Override
    public void onEnable(){
        //config
        plugin.getConfig().options().copyDefaults(true);
        plugin.saveDefaultConfig();
        //custom items
        CustomItems.init();
    }

    public void registerListeners(){
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new ZombieSpawnListener(this), this);
        pm.registerEvents(new SkeletonSpawnListener(this), this);
        pm.registerEvents(new DarkNights(this), this);
        //pm.registerEvents(new ListnerName(this), this);
    }


    /**Needs For Swift:
     *
     * Game Settings (Darker Nights *DONE*, Deaths System, Health Regen)
     * Custom Mobs *DONE*
     * Spawning System, First Time = Random Spawn
     * Chests - Spawning in towns + Items in Them
     * Inventory System
     * Custom Items (Wands, Karma Restores)
     * Karma System
     * Player Levels (No. Kills)
     *
     */



}
