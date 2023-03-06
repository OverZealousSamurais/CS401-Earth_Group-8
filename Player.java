package crm;

import java.util.ArrayList;

import java.util.List;

public class Player {
    private String name;
    private Integer dirt;
    private Integer smallGrowthToken;
    private Integer largeGrowthToken;
    private Integer vp;

    private List<Island_Card> hand;

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<Island_Card>();
    }

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

    public void addVP(Integer VP){
        this.vp = vp + this.vp;
    }
}
