package Card;

import Player.Player;

public class Fauna_Card {
    private String cardName;
    private String scientificName;
    private String objective;
    private Float percentageOfCards;

    // TODO populate fauna cards from database
    public Fauna_Card(String cardName, String scientificName, String objective, Float percentageOfCards) {
        this.cardName = cardName;
        this.scientificName = scientificName;
        this.objective = objective;
        this.percentageOfCards = percentageOfCards;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public Float getPercentageOfCards() {
        return percentageOfCards;
    }

    public void setPercentageOfCards(Float percentageOfCards) {
        this.percentageOfCards = percentageOfCards;
    }

    public void checkObjective(String objective, Player player) {
        String[] strArr = objective.split(" ");
        String amountOfWhat = strArr[0];
        String[] tokens = amountOfWhat.split(" ");
        Integer amount = Integer.parseInt(tokens[0]);
        if (tokens[1].equals(">")) {
            switch (tokens[2]) {
                case "Soil":
                    if (player.getDirt() > amount) {
                        //TODO implement Fauna board
                        player.addVP(Fauna_Board.getVP());
                    }

                case "Cards":
                    if (player.getHandSize() > amount) {
                        player.addVP(Fauna_Board.getVP());
                    }
            }
        } else if (tokens[1].equals("<")){
            switch (tokens[2]) {
                case "Soil":
                    if (player.getDirt() < amount) {
                        //TODO implement Fauna board
                        player.addVP(Fauna_Board.getVP());
                    }

                case "Cards":
                    if (player.getHandSize() < amount) {
                        player.addVP(Fauna_Board.getVP());
                    }
            }
        }
    }
}
