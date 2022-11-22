package bridge;

import bridge.enums.ControlKey;
import bridge.enums.InGameMessage;

import java.util.ArrayList;
import java.util.List;

public class BridgeGame {

    private Bridge bridge;
    private MapMaker mapMaker;
    private int gameCount = 1;
    private boolean crossed = true;
    private List<String> directions = new ArrayList<>();

    public BridgeGame(Bridge bridge) {
        this.bridge = bridge;
        this.mapMaker = new MapMaker();
    }

    public void play(String input) {
        move(input);
    }

    private void move(String inputKey) {
        directions.add(inputKey);
        int index = directions.size() - 1;
        mapMaker.updateMap(bridge, index, inputKey);
    }
}
