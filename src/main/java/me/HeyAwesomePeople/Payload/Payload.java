package me.HeyAwesomePeople.Payload;

import me.HeyAwesomePeople.Payload.game.MapManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Payload extends JavaPlugin {
    public static Payload instance;

    public MapManager mapManager;

    @Override
    public void onEnable() {
        instance = this;

        mapManager = new MapManager();

    }

    @Override
    public void onDisable() {

    }


}
