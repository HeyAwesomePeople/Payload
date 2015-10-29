package me.HeyAwesomePeople.Payload.game;

import org.bukkit.entity.Player;

public class PayloadPlayer {

    public enum PlayerState {
        SPECTATOR, PLAYER, WAITER;
    }

    private Class clas;
    private Player player;
    private Team team;


    public PayloadPlayer(Player p) {
        this.player = p;
    }

    /* Getters */

    /* Setters */
    public void setTeam(Team t) {
        this.team = t;
    }

    public void setDefaultTeam() {
        this.team = Team.SPEC;
    }

    /* Commands */

    public void sendToTeam() {

    }

    public void setToSpectator() {

    }

    /* Data */



}
