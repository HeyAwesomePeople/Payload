package me.HeyAwesomePeople.Payload.hooks;

import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;
import me.HeyAwesomePeople.Payload.Payload;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Item;

public class Holograms {

    private Payload plugin = Payload.instance;

    public Holograms() {
        checkForEnabled();
    }

    public void createDisappearingFloatingItem(String name, Location l, Item i, long time) {
        final Hologram hologram = HologramsAPI.createHologram(plugin, l);
        hologram.appendItemLine(i.getItemStack());
        hologram.appendTextLine(name);
        Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
            public void run() {
                hologram.delete();
            }
        }, time);
    }

    public void createFloatingItem(String name, Location l, Item i) {
        final Hologram hologram = HologramsAPI.createHologram(plugin, l);
        hologram.appendItemLine(i.getItemStack());
        hologram.appendTextLine(name);
    }

    public boolean checkForEnabled() {
        if (!Bukkit.getPluginManager().isPluginEnabled("HolographicDisplays")) {
            Bukkit.getConsoleSender().sendMessage("*** HolographicDisplays is not installed or not enabled. ***");
            Bukkit.getConsoleSender().sendMessage("*** Powerups using this will not work ***");
            return false;
        }
        return true;
    }

}
