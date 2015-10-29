package me.HeyAwesomePeople.Payload.checkpoint;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.UUID;

public class Checkpoint {

    public enum CheckpointTeam {
        RED, BLU;
    }

    private Location checkpoint = null;
    private CheckpointTeam team;
    private Integer radius = 0;
    private Player editor;

    public Checkpoint(Location check, CheckpointTeam team) {
        this.team = team;
        this.checkpoint = check;
    }

    public CheckpointTeam getTeam() {
        return this.team;
    }

    public Integer getRadius() {
        if (radius == null) {
            return 10;
        }
        return radius;
    }

    /* Logger */

    // TODO When you set a checkpoint in the plugin, you activate a logger. The logger tracks everything you do.
    // TODO this way you can make checkpoints seperate from maps. And the checkpoints could be made for both color
    // TODO teams, meaning map sides can be easily switched
    public void loadCheckpoint() {
        startEffects();
    }

    public void startEffects() {

    }

    public boolean isBeingEdited() {
        if (this.editor != null && this.editor.isOnline()) {
            return true;
        }
        return false;
    }

    public Player getEditor() {
        return this.editor;
    }


    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setLocation(int location) {

    }

    public void clearUnusedData() {
        if (!this.editor.isOnline()) this.editor = null;
    }

}
