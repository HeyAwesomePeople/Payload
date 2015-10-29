package me.HeyAwesomePeople.Payload;

import org.bukkit.plugin.java.JavaPlugin;

public class Payload extends JavaPlugin {
    public static Payload instance;

    @Override
    public void onEnable() {
        instance = this;

    }

    @Override
    public void onDisable() {

    }


}
