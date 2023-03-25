package Player;
import Card.*;
import java.util.ArrayList;

import java.util.List;

public class Player {
    private String name;
    private Integer dirt = 0;
    private Integer smallGrowthToken = 0;
    private Integer largeGrowthToken = 0;
    private Integer compost = 0;
    private Integer vp = 0;

    private List<Island_Card> hand;

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<Island_Card>();
    }

    //TODO shift from Island_card usage to generic cards
    public void drawCard(Island_Card card) {
        hand.add(card);
    }

    public Island_Card playCard(int index) {
        return hand.remove(index);
    }

    public List<Island_Card> getHand() {
        return hand;
    }

    public int getHandSize() {
        return hand.size();
    }

    public void addDirt(Integer Dirt){this.dirt = Dirt + this.dirt;}

    public void addSmallGrowthToken(Integer SGT){
        this.smallGrowthToken = SGT + this.smallGrowthToken;
    }

    public void addLargeGrowthToken(Integer LGT){
        this.largeGrowthToken = LGT + this.largeGrowthToken;
    }

    public void addCompost(Integer Compost){
        this.compost = Compost + this.compost;
    }
    public void addVP(Integer VP){
        this.vp = vp + this.vp;
    }

    public int getDirt(){return dirt; }
    public int getSmallGrowthToken(){return smallGrowthToken; }
    public int getLargeGrowthToken(){return largeGrowthToken; }
    public int getCompost(){return compost; }
    public int getVP(){return vp; }
}
