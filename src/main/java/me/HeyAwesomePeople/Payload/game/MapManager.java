package me.HeyAwesomePeople.Payload.game;

import java.util.ArrayList;
import java.util.List;

public class MapManager {

    private List<Map> maps = new ArrayList<Map>();

    public MapManager() {}

    public List<Map> getMaps() {
        return this.maps;
    }

}
