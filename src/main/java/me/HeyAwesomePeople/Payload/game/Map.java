package me.HeyAwesomePeople.Payload.game;

import me.HeyAwesomePeople.Payload.checkpoint.Checkpoint;
import me.HeyAwesomePeople.Payload.game.powerups.PowerUpManager;
import org.bukkit.Location;

import java.util.ArrayList;
import java.util.List;

public class Map {

    private Location redSpawn;
    private Location bluSpawn;

    private List<Location> powerUpPoints = new ArrayList<Location>();
    private List<Checkpoint> checkpoints = new ArrayList<Checkpoint>();

    public Map() {
        preMapLoad();
        postMapLoad();
    }

    private void preMapLoad() {

    }

    private void postMapLoad() {
        for (Location l : powerUpPoints) {
            PowerUpManager.spawnRandomPowerUp(l);
        }
    }

    public List<Checkpoint> getCheckpoints() {
        return this.checkpoints;
    }

}
