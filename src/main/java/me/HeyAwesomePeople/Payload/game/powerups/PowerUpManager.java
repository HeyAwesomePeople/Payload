package me.HeyAwesomePeople.Payload.game.powerups;

import me.HeyAwesomePeople.Payload.Payload;
import org.bukkit.Location;
import org.bukkit.entity.Item;

import java.util.HashMap;

public class PowerUpManager {
    private Payload plugin = Payload.instance;

    public static void spawnRandomPowerUp(Location l) {
        //TODO
        plugin.holograms.createDisappearingFloatingItem("", l, null, 0);
    }

}
