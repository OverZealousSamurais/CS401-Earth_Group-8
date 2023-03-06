package org.example;
public abstract class Card {
    private String name;
    public int soilCost;
    private String soil;


    public Card(String name, int soilCost) {
        this.name = name;
        this.soilCost = soilCost;
    }

    public String getName() {
        return name;
    }

    public int getSoilCost() {
        return soilCost;
    }
}
