import Card.*;
import Player.Player;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test_Fauna_Cards {
static ArrayList<Fauna_Card> fauna_cards = new ArrayList<>();
static Fauna_Card fauna_card1;
static Fauna_Card fauna_card2;
static Player player;
@BeforeAll
    static void loadFaunaCardsAndPlayer() {
        fauna_card1 = new Fauna_Card("European Mole", "Talpa europaea", "20 > Soil in your reserve", 0f);
        fauna_card2 = new Fauna_Card("Andean Condor", "Vultur gryphus", "20 > Cards in your hand", 0.44f);
        player = new Player("Dude");
    }

@Test
    void addPointsToPlayer() {
    //Objective is fulfilled and player receives points
        loadFaunaCardsAndPlayer();
        int startingVP = player.getVP();
        for (int i = 0; i < 22; i++) {
            player.addDirt(1);
        }
        fauna_card1.checkObjective(fauna_card1.getObjective(), player);
        assertTrue(player.getVP() > startingVP);

        // If objective is not fulfilled points should not be added
        for (int i = 0; i < 15; i++) {
            Island_Card newCard = new Island_Card("Kauai", 0, 12, 5, 6);
            player.drawCard(newCard);
        }
        int currentVP = player.getVP();
        fauna_card2.checkObjective(fauna_card2.getObjective(), player);
        assertEquals(player.getVP(), (int) currentVP);
    }
}
