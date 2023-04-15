package Card;

public class Fauna_Card {
    private String cardName;
    private String scientificName;
    private String objective;
    private Float percentageOfCards;

    public Fauna_Card(String cardName, String scientificName, String objective, Float percentageOfCards) {
        this.cardName = cardName;
        this.scientificName = scientificName;
        this.objective = objective;
        this.percentageOfCards = percentageOfCards;
    }

    public String getCardName() {
        return cardName;
    }

    public String getScientificName() {
        return scientificName;
    }

    public String getObjective() {
        return objective;
    }

    public Float getPercentageOfCards() {
        return percentageOfCards;
    }
}
