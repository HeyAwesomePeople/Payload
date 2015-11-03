package me.HeyAwesomePeople.Payload;

import me.HeyAwesomePeople.Payload.game.MapManager;
import me.HeyAwesomePeople.Payload.hooks.Holograms;
import org.bukkit.plugin.java.JavaPlugin;

public class Payload extends JavaPlugin {
    public static Payload instance;

    public MapManager mapManager;
    public Holograms holograms;

    @Override
    public void onEnable() {
        instance = this;

        mapManager = new MapManager();
        holograms = new Holograms();

    }

    @Override
    public void onDisable() {

    }


}
