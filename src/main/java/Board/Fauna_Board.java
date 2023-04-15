package Board;

import Card.Fauna_Card;
import Player.Player;

import java.util.ArrayList;
import java.util.HashMap;

public class Fauna_Board {
    HashMap<Fauna_Card, ArrayList<Player>> faunaSlots;

    public Fauna_Board(HashMap<Fauna_Card, ArrayList<Player>> slots) {
        this.faunaSlots = slots;
    }

    public HashMap<Fauna_Card, ArrayList<Player>> getFaunaSlots() {
        return faunaSlots;
    }

    public void setFaunaSlots(HashMap<Fauna_Card, ArrayList<Player>> faunaSlots) {
        this.faunaSlots = faunaSlots;
    }
}
