package org.example;

import java.util.List;

// go back and create methods
// ignore temp initializations and naming
// need to check if player is active
public class PlantAction {

    public void plantAction( Player isActive, List<Player> allPlayers) {

        boolean activePlayer = false; // temp.
        // The active player may plant up to 2 cards, one at a time, into their tableau by paying the Soil costs.

        for (int i = 0; i < 2; i++) {
            Card cardToPlant = activePlayer.chooseCardToPlant();
            if (cardToPlant == null) {
                break; // No more cards to plant
            }
            // need to create Flora and Terrain
            if (!(cardToPlant instanceof FloraCard || cardToPlant instanceof TerrainCard)) {
                throw new IllegalArgumentException("Error");
            }
            int soilCost = cardToPlant.getSoilCost();
            if (activePlayer.getSoil() < soilCost ) { // create method for soil
                throw new IllegalArgumentException("Need more soil to plant"); // throws exception if not enough to plant
            }

            // not sure if need to return the cost after exception
            if (i == 0) {
                // Place the first card anywhere in the tableau
                activePlayer.placeCardInTableau(cardToPlant, -1, -1); //temp naming
            } else {
                // Place subsequent cards adjacent to an existing card
                activePlayer.placeCardInTableauAdjacent(cardToPlant); //temp naming
            }
        }
    }
}