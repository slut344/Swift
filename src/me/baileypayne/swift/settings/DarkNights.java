package me.baileypayne.swift.settings;

import me.baileypayne.swift.MasterListener;
import me.baileypayne.swift.Swift;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

/**
 * Created by Bailey on 01/12/2014.
 */
public class DarkNights extends MasterListener {

    public DarkNights(Swift pl){
        super(pl);
    }

    @EventHandler
    public void onPlayerMoveEvent(PlayerMoveEvent e) {
        Player p = e.getPlayer();
        Location l = p.getLocation();
        int lightlevel = p.getLocation().getBlock().getLightLevel();
        if (lightlevel < 5) {
            p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Integer.MAX_VALUE, 1));
        } else {
            p.removePotionEffect(PotionEffectType.BLINDNESS);

        }
    }
}
