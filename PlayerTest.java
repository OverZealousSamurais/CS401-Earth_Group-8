import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import java.util.List;
class PlayerTest {
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		

		
	
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testPlayer() {
		Player play1 = new Player("john");
		Player play2 = new Player("suzy");
		//fail("Not yet implemented");
	}

	@Test
	void testDrawCard() {
		Player player = new Player("TestPlayer");
        Island_Card card = new Island_Card("TestCard", "water", 1,2,3);
        player.drawCard(card);
        List<Island_Card> hand = player.getHand();
        assertEquals(1, hand.size());
        assertEquals(card, hand.get(0));
		
		//fail("Not yet implemented");
	}

	@Test
	void testPlayCard() {
		Player player = new Player("TestPlayer");
        Island_Card card = new Island_Card("TestCard", "water", 1,2,3);
        player.drawCard(card);
        Island_Card playedCard = player.playCard(0);
        assertEquals(card, playedCard);
        List<Island_Card> hand = player.getHand();
        assertEquals(0, hand.size());
		//fail("Not yet implemented");
	}

	@Test
	void testGetHand() {
		Player player = new Player("TestPlayer");
        Island_Card card = new Island_Card("TestCard", "water", 1,2,3);
        Island_Card card2 = new Island_Card("TestCard2", "plains", 1,2,4);
        player.drawCard(card);
        player.drawCard(card2);
        List<Island_Card> hand = player.getHand();
        assertEquals(2, hand.size());
        assertEquals(card, hand.get(0));
        assertEquals(card2, hand.get(1));
		//fail("Not yet implemented");
	}

	@Test
	void testGetHandSize() {
		Player player = new Player("jeff");
		Island_Card card = new Island_Card("TestCard", "water", 1,2,3);
        Island_Card card2 = new Island_Card("TestCard2", "plains", 1,2,4);
        Island_Card card3 = new Island_Card("TestCard", "water", 1,2,7);
        player.drawCard(card);
        player.drawCard(card2);
        List<Island_Card> hand = player.getHand();
		assertEquals(2, hand.size());
		//fail("Not yet implemented");
	}
/* TODO test dirt/tokens when all cards have been fully implemented*/
	@Test
	void testAddDirt() {
		fail("Not yet implemented");
	}

	@Test
	void testAddSmallGrowthToken() {
		fail("Not yet implemented");
	}

	@Test
	void testAddLargeGrowthToken() {
		fail("Not yet implemented");
	}

	@Test
	void testAddCompost() {
		fail("Not yet implemented");
	}

	@Test
	void testAddVP() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDirt() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSmallGrowthToken() {
		fail("Not yet implemented");
	}

	@Test
	void testGetLargeGrowthToken() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCompost() {
		fail("Not yet implemented");
	}

	@Test
	void testGetVP() {
		fail("Not yet implemented");
	}

}
