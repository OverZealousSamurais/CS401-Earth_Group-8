package crm;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;


public class Test_Cases {
    @Test
    public void testPlayerUsingInstantCards() {
        List<Player> playerList = null;
        List<Instant_Card> deckOfInstantCards = null;

        deckOfInstantCards.add(new Instant_Card("Storm", "There is a thunderstorm.", 1, 0));
        deckOfInstantCards.add(new Instant_Card("Cold Front", "Can cause a narrow line of thunderstorms.", 2, 0));
        deckOfInstantCards.add(new Instant_Card("Fire", "There is fire.", 3, 0));
        deckOfInstantCards.add(new Instant_Card("Rain", "There is rain.", 3, 0));

        playerList.add(new Player("Shaun"));
        playerList.add(new Player("Aurelius"));

        for (int i = 0; i < 3; i++){
            Player currPlayer = playerList.get(0);
            currPlayer.setTurnStatus(true);
            while (currPlayer.getTurnStatus() == true){
                currPlayer.drawCard(deckOfInstantCards.get(0));
                deckOfInstantCards.remove(0);
                if (currPlayer.getAmtOfInstantCards() > 0){
                    currPlayer.getHandSize();
                    currPlayer.getHand();
                    currPlayer.playCard(0);
                }
                currPlayer.setTurnStatus(false);
            }
            currPlayer = playerList.get(1);
            currPlayer.setTurnStatus(true);
            while (currPlayer.getTurnStatus() == true){
                currPlayer.drawCard(deckOfInstantCards.get(0));
                deckOfInstantCards.remove(0);
                if (currPlayer.getAmtOfInstantCards() > 0){
                    currPlayer.getHandSize();
                    currPlayer.getHand();
                    currPlayer.playCard(0);
                }
                currPlayer.setTurnStatus(false);
            }
        }
    }
}