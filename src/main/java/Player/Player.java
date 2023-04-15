package Player;

import Board.Player_Board;
import Board.Tableau;
import Card.Instant_Card;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private Player_Board board;
    private Tableau tableau;
    private Integer dirt = 0;
    private Integer smallGrowthToken = 0;
    private Integer largeGrowthToken = 0;
    private Integer compost = 0;
    private Integer vp = 0;
    private Integer amtOfInstantCards = 0;
    private boolean turnStatus = true;
    private List<Instant_Card> hand;

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<Instant_Card>();
    }

    public void drawCard(Instant_Card card) {
        if (card.getType() == "Instant"){
            amtOfInstantCards += 1;
        }
        hand.add(card);
    }

    public Instant_Card playCard(int index) {
        return hand.remove(index);
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

    public void setTurnStatus(Boolean status){
        this.turnStatus = status;
    }

    public int getDirt(){return dirt; }
    public int getSmallGrowthToken(){return smallGrowthToken; }
    public int getLargeGrowthToken(){return largeGrowthToken; }
    public int getCompost(){return compost; }
    public int getVP(){return vp; }
    public int getAmtOfInstantCards(){return amtOfInstantCards;}
    public boolean getTurnStatus() {return turnStatus;}

    public List<Instant_Card> getHand() {return hand;}
    public int getHandSize() {
        return hand.size();
    }

    public Tableau getTableau() {
        return tableau;
    }

    public Player_Board getBoard() {
        return board;
    }
}
