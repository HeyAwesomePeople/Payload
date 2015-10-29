package me.HeyAwesomePeople.Payload.game;

import me.HeyAwesomePeople.Payload.checkpoint.Checkpoint;
import org.bukkit.Location;

import java.util.ArrayList;
import java.util.List;

public class Map {

    private Location redSpawn;
    private Location bluSpawn;

    private List<Checkpoint> checkpoints = new ArrayList<Checkpoint>();

    public Map() {

    }

    public List<Checkpoint> getCheckpoints() {
        return this.checkpoints;
    }

}
