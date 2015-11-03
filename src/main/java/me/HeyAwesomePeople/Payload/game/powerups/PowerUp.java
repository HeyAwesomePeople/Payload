package me.HeyAwesomePeople.Payload.game.powerups;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class PowerUp {

    private static HashMap<String, Location> powerups = new HashMap<String, Location>();

    public static void spawnHealth(Location l) {
        powerups.put("health", l);
    }

    public static void spawnAmmo(Location l) {
        powerups.put("ammo", l);
    }

    public static void spawnToken(Location l) {
        powerups.put("token", l);
    }

    public static void spawnInstakill(Location l) {
        powerups.put("instakill", l);
    }

    public static void spawnStrength(Location l) {
        powerups.put("strength", l);
    }

    public static void spawnSpeed(Location l) {
        powerups.put("speed", l);
    }


    @EventHandler
    public void onPlayerMoveEvent(PlayerMoveEvent e) {
        if (powerups.values().contains(e.getTo().getBlock().getLocation())) {
            for (String name : powerups.keySet()) {
                if (powerups.get(name).equals(e.getTo().getBlock().getLocation())) {
                    //TODO
                    return;
                }
            }
        }
    }


}
