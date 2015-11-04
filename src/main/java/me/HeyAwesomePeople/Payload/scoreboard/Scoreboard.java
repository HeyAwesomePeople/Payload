package me.HeyAwesomePeople.Payload.scoreboard;

import be.maximvdw.placeholderapi.PlaceholderAPI;
import be.maximvdw.placeholderapi.PlaceholderReplaceEvent;
import be.maximvdw.placeholderapi.PlaceholderReplacer;
import me.HeyAwesomePeople.Payload.Payload;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

public class Scoreboard {

    private Payload plugin = Payload.instance;

    public Scoreboard() {
        hookFeatherboard();
    }

    public void updateForAll() {
        for (Player p : Bukkit.getOnlinePlayers()) {

        }
    }

    public void hookFeatherboard() {
        if (Bukkit.getPluginManager().isPluginEnabled("MVdWPlaceholderAPI")) {
            // The plugin is enabled
            PlaceholderAPI.registerPlaceholder(plugin, "gamestatus",
                    new PlaceholderReplacer() {

                        @Override
                        public String onPlaceholderReplace(
                                PlaceholderReplaceEvent event) {

                            return "test";
                        }

                    });
        }
    }

}
