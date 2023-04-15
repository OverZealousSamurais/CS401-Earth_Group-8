package Board;

import Card.*;
import Player.Player;

import java.util.ArrayList;
import java.util.HashMap;

public class Fauna_Board {
    HashMap<Fauna_Card, ArrayList<Player>> faunaSlots;

    public Fauna_Board(HashMap<Fauna_Card, ArrayList<Player>> slots) {
        this.faunaSlots = slots;
    }

    public HashMap<Fauna_Card, ArrayList<Player>> getFaunaSlots() {
        return faunaSlots;
    }

    public void setFaunaSlots(HashMap<Fauna_Card, ArrayList<Player>> faunaSlots) {
        this.faunaSlots = faunaSlots;
    }

    public void checkObjective(Fauna_Card fauna, Player player) {
        switch (fauna.getCardName()) {
            case "Bald Eagle": {
                int totalPlantedFlora = player.getTableau().getPlantedFlora().size();
                ArrayList<Flora_Card> plantedFloras = player.getTableau().getPlantedFlora();
                int floraWithThreeOrMoreGrowth = 0;
                for (Flora_Card plantedFlora : plantedFloras) {
                    if (plantedFlora.getGrowth() >= 3) {
                        floraWithThreeOrMoreGrowth++;
                    }
                }
                if (totalPlantedFlora >= 4 && (floraWithThreeOrMoreGrowth == plantedFloras.size())) {
                    givePoints(fauna, player);
                }
            }
            case "Yellow-Bellied Marmot": {
                int totalPlantedFlora = player.getTableau().getPlantedFlora().size();
                ArrayList<Flora_Card> plantedFloras = player.getTableau().getPlantedFlora();
                int floraWithFourOrMoreSprout = 0;
                for (Flora_Card plantedFlora : plantedFloras) {
                    if (plantedFlora.getSprout() >= 4) {
                        floraWithFourOrMoreSprout++;
                    }
                }
                if (totalPlantedFlora >= 6 && (floraWithFourOrMoreSprout == plantedFloras.size())) {
                    givePoints(fauna, player);
                }
            }
            case "European Mole": {
                if (player.getDirt() >= 20) {
                    givePoints(fauna, player);
                }
            }
            case "Andean Condor": {
                if (player.getHandSize() >= 20) {
                    givePoints(fauna, player);
                }
            }
            case "Mountain Lion": {
                ArrayList<Terrain_Card> playerTerrains = player.getTableau().getPlantedTerrain();
                ArrayList<Flora_Card> playerFlora = player.getTableau().getPlantedFlora();
                ArrayList<Island_Card> playerIslands = player.getBoard().getIslands();
                int rockyHabitats = 0;
                for (Terrain_Card terrain : playerTerrains) {
                    for (String habitat: terrain.getHabitats()) {
                        if (habitat.equals("Rocky")) {
                            rockyHabitats++;
                        }
                    }
                }
                for (Flora_Card flora : playerFlora) {
                    for (String habitat: flora.getHabitats()) {
                        if (habitat.equals("Rocky")) {
                            rockyHabitats++;
                        }
                    }
                }
                for (Island_Card island : playerIslands) {
                    for (String habitat: island.getHabitats()) {
                        if (habitat == "Rocky") {
                            rockyHabitats++;
                        }
                    }
                }
                if (rockyHabitats >= 8) {
                    givePoints(fauna, player);
                }
            }
            case "American Alligator": {
                ArrayList<Terrain_Card> playerTerrains = player.getTableau().getPlantedTerrain();
                ArrayList<Flora_Card> playerFlora = player.getTableau().getPlantedFlora();
                ArrayList<Island_Card> playerIslands = player.getBoard().getIslands();
                int wetHabitats = 0;
                for (Terrain_Card terrain : playerTerrains) {
                    for (String habitat: terrain.getHabitats()) {
                        if (habitat.equals("Wet")) {
                            wetHabitats++;
                        }
                    }
                }
                for (Flora_Card flora : playerFlora) {
                    for (String habitat: flora.getHabitats()) {
                        if (habitat.equals("Wet")) {
                            wetHabitats++;
                        }
                    }
                }
                for (Island_Card island : playerIslands) {
                    for (String habitat: island.getHabitats()) {
                        if (habitat.equals("Wet")) {
                            wetHabitats++;
                        }
                    }
                }
                if (wetHabitats >= 8) {
                    givePoints(fauna, player);
                }
            }
            case "Bornean Orangutan": {
                ArrayList<Flora_Card> plantedFlora = player.getTableau().getPlantedFlora();
                int totalTrees = 0;
                for (Flora_Card flora: plantedFlora) {
                    if (flora.getType().equals("Tree")) {
                        totalTrees++;
                    }
                }
                if (totalTrees >= 4) {
                    givePoints(fauna, player);
                }
            }
            case "Lubber Grasshopper": {
                ArrayList<Flora_Card> plantedFlora = player.getTableau().getPlantedFlora();
                int totalHerbs = 0;
                for (Flora_Card flora: plantedFlora) {
                    if (flora.getType().equals("Herb")) {
                        totalHerbs++;
                    }
                }
                if (totalHerbs >= 4) {
                    givePoints(fauna, player);
                }
            }
            case "Echidna": {
                ArrayList<Climate_Card> playerClimates = player.getBoard().getClimates();
                ArrayList<Flora_Card> playerFlora = player.getTableau().getPlantedFlora();
                ArrayList<Island_Card> playerIslands = player.getBoard().getIslands();
                int redAbilities = 0;
                for (Climate_Card climate : playerClimates) {
                    //TODO Reimplement Climate_Card class
                    if (climate.getAbility().getColor().equals("red")) {
                        redAbilities++;
                    }
                }
                for (Flora_Card flora : playerFlora) {
                    if (flora.getAbility().getColor().equals("red")) {
                        redAbilities++;
                    }
                }
                for (Island_Card island : playerIslands) {
                    if (island.getAbility().getColor().equals("red")) {
                        redAbilities++;
                    }
                }
                if (redAbilities >= 6) {
                    givePoints(fauna, player);
                }
            }
            case "Green Iguana": {
                ArrayList<Climate_Card> playerClimates = player.getBoard().getClimates();
                ArrayList<Flora_Card> playerFlora = player.getTableau().getPlantedFlora();
                ArrayList<Island_Card> playerIslands = player.getBoard().getIslands();
                int yellowAbilities = 0;
                for (Climate_Card climate : playerClimates) {
                    //TODO Reimplement Climate_Card class
                    if (climate.getAbility().getColor().equals("yellow")) {
                        yellowAbilities++;
                    }
                }
                for (Flora_Card flora : playerFlora) {
                    if (flora.getAbility().getColor().equals("yellow")) {
                        yellowAbilities++;
                    }
                }
                for (Island_Card island : playerIslands) {
                    if (island.getAbility().getColor().equals("yellow")) {
                        yellowAbilities++;
                    }
                }
                if (yellowAbilities >= 6) {
                    givePoints(fauna, player);
                }
            }
            case "Northern Giraffe": {
                Tableau tableau = player.getTableau();
                ArrayList<ArrayList<Object>> filledColumns = new ArrayList<>();
                for (int i = 0; i < tableau.getBoard().length; i++) {
                    if (!tableau.getCol(i).contains(null)) {
                        filledColumns.add(tableau.getCol(i));
                    }
                }
                if (filledColumns.size() >= 2) {
                    givePoints(fauna, player);
                }
            }
            case "Emerald Tree Boa" {
                if (player.getTableau().checkDiagonals()) {
                    givePoints(fauna, player);
                }
            }
        }
    }

    private void givePoints(Fauna_Card fauna, Player player) {
        switch (getFaunaSlots().get(fauna).size()) {
            case 0: {
                getFaunaSlots().get(fauna).add(player);
                player.addVP(15);
            }
            case 1: {
                getFaunaSlots().get(fauna).add(player);
                player.addVP(11);
            }
            case 2: {
                getFaunaSlots().get(fauna).add(player);
                player.addVP(8);
            }
            case 3: {
                getFaunaSlots().get(fauna).add(player);
                player.addVP(6);
            }
            case 4: {
                getFaunaSlots().get(fauna).add(player);
                player.addVP(5);
            }
        }
    }
}
