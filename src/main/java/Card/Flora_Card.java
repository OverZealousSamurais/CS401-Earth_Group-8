package Card;

import Action.Ability;

import java.util.ArrayList;

public class Flora_Card {
    private String cardName;
    private String type;
    private Ability ability;
    private final ArrayList<String> habitats;
    private int victPoint = 0;
    private int drawEarth = 0;
    private int compCard = 0;
    private int soil = 0;
    private int growth = 0;
    private int sprout = 0;

    public Flora_Card(String cardName, Ability ability, ArrayList<String> habitats, int victPoint, int drawEarth,int compCard,int soil, int growth, int sprout, String type) {
        this.cardName = cardName;
        this.ability = ability;
        this.type = type;
        this.habitats = habitats;
        this.victPoint = victPoint;
        this.drawEarth= drawEarth;
        this.compCard = compCard;
        this.soil= soil;
        this.growth = growth;
        this.sprout = sprout;
    }

    public void setName(String cardName) {
        this.cardName = cardName;
    }
    public void setType(String type) { this.type = type; }
    public void setVict(int victPoint) {
        this.victPoint = victPoint;
    }
    public void setEarth(int drawEarth ) {
        this.drawEarth = drawEarth;
    }
    public void setComp(int compCard) {
        this.compCard = compCard;
    }
    public void setsoil(int soil) {
        this.soil = soil;
    }
    public void setGrowth(int growth) { this.growth = growth; }
    public void setSprout(int sprout) {
        this.sprout = sprout;
    }

    public String getName() {
        return cardName;
    }

    public String getType() {
        return type;
    }

    public Ability getAbility() {
        return ability;
    }

    public ArrayList<String> getHabitats() {
        return habitats;
    }

    public int getVict() {
        return victPoint;
    }
    public int getEarth() {
        return drawEarth;
    }
    public int getComp() {
        return compCard;
    }
    public int getSoil() {
        return soil;
    }
    public int getSprout() { return sprout; }

    public int getGrowth() {
        return growth;
    }
}
