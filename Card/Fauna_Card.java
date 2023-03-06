package Card;

import java.util.ArrayList;

public class Fauna_Card {
    private String cardName;
    private String objective;

    // TODO convert to list of leafTokens when Leaf Token Class is created
    private ArrayList<String> leafTokens;
    public Fauna_Card(String cardName, String objective, ArrayList<String> leafTokens) {
        this.cardName = cardName;
        this.objective = objective;
        this.leafTokens = leafTokens;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }


    public ArrayList<String> getLeafTokens() {
        return leafTokens;
    }

    public void setLeafTokens(ArrayList<String> leafTokens) {
        this.leafTokens = leafTokens;
    }
}
