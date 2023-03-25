package org.example;

public class ClimateCard {
    private String cardName;
    private String habitats;
    private String frontSide;
    private String backSide;
    private int victoryPoint;

    private static boolean isFrontSideChosen;

    public int getDrawCards(int iconNumber) {
        return iconNumber;
    }
    public ClimateCard(int victoryPoint, String habitats, String frontSide, String backSide) {
        this.victoryPoint = victoryPoint;
        this.habitats = habitats;
        this.frontSide= frontSide;
        this.backSide = backSide;
        this.isFrontSideChosen = true; // by default, front side is chosen
    }

    public static int getVictoryPoint() {
        return this.victoryPoint;
    }
    public static String getAbility() {
        if (isFrontSideChosen) {
            return this.frontSide;
        } else {
            return this.frontSide;
        }
    }
    public static String getHabitats() {
        return this.habitats;
    }


    public static void setBackSide() {
        this.isFrontSideChosen = false;
    }

    public static boolean isFrontSideChosen() {
        return this.isFrontSideChosen;
    }

    public void setFrontSide() {
    }

    // These checks the abilities the card has such  as -1 compost for 5 soils.
    public int getLeftIconValue() {
        String[] parts = frontSide.split(" ");
        int value = Integer.parseInt(parts[0]);
        return value;
    }

    public int getRightIconValue() {
        String[] parts = backSide.split(" ");
        int value = Integer.parseInt(parts[0]);
        return value;
    }
}
