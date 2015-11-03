package me.HeyAwesomePeople.Payload.checkpoint;

import me.HeyAwesomePeople.Payload.Payload;
import me.HeyAwesomePeople.Payload.game.Map;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import java.util.HashMap;

public class CheckpointListener implements Listener {

    private static Payload plugin = Payload.instance;

    public HashMap<Checkpoint, HashMap<Checkpoint.CheckpointTeam, Block>> addedBlocks = new HashMap<Checkpoint, HashMap<Checkpoint.CheckpointTeam, Block>>();
    public HashMap<Checkpoint, HashMap<Checkpoint.CheckpointTeam, Block>> removedBlocks = new HashMap<Checkpoint, HashMap<Checkpoint.CheckpointTeam, Block>>();


    @EventHandler(priority = EventPriority.MONITOR)
    public void playerBreakBlockCheckpoint(BlockBreakEvent e) {
        for (Map m : plugin.mapManager.getMaps()) {
            for (Checkpoint c : m.getCheckpoints()) {
                if (c.isBeingEdited()) {
                    removedBlock(c, c.getTeam(), e.getBlock());
                }
            }
        }
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void playerPlaceBlockCheckpoint(BlockPlaceEvent e) {
        for (Map m : plugin.mapManager.getMaps()) {
            for (Checkpoint c : m.getCheckpoints()) {
                if (c.isBeingEdited()) {
                    placedBlock(c, c.getTeam(), e.getBlock());
                }
            }
        }
    }

    public void placedBlock(Checkpoint c, Checkpoint.CheckpointTeam ct, Block b) {
        if (removedBlocks.get(c).get(ct).equals(b)) {
            removedBlocks.remove(c);
            return;
        }
    }

    public void removedBlock(Checkpoint c, Checkpoint.CheckpointTeam ct, Block b) {

    }


}
