import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClimateCardTest {

    // Test the user's decision on whether they want to use front side or backside.
    public void testSetBackSide() {
        // Arrange
        ClimateCard card = new ClimateCard(100, "Sunny", "Front", "Back");
        // We assert true because by default front side is chosen.
        assertTrue(card.isFrontSideChosen());

        // lets say user wants to set it to back side instead.
        card.setBackSide();

        //check that front side is now NOT chosen
        assertFalse(card.isFrontSideChosen());

        // If user decides to set the front side of the card
        card.setFrontSide();

        // Front is set
        assertTrue(card.isFrontSideChosen());
    }

    // Check the abilities on the bottom of the card (left icon)
    @Test
    public void testLeftIcon() {
        ClimateCard card = new ClimateCard(4, "Rocky", "-1 Discard from Compost", "+2 Soil");
        int expectedDiscardCount = 1; // Left icon has -1 value
        int expectedSoilCount = 2; // Right icon has +2 value

        // Verify that the left icon value
        assertEquals(expectedDiscardCount, card.getLeftIconValue());

        // Verify that the right icon value
        assertEquals(expectedSoilCount, card.getRightIconValue());
    }
    // Check the abilities on the bottom of the card (right icon)
    @Test
    public void testRightIcon() {
        ClimateCard card = new ClimateCard(3, "Cold", "+3 Soil", "-2");
        int expectedSoilCount = 3; // Right icon has +3 value
        int expectedAnimalCount = -2; // Left icon has -2 value

        // Verify that the left icon value
        assertEquals(expectedAnimalCount, card.getLeftIconValue());

        // Verify that the right icon value
        assertEquals(expectedSoilCount, card.getRightIconValue());
    }
    //Check the designated icon number on csrd and assign the amount to draw
    @Test
    public void testDrawCards() {
        ClimateCard card = new ClimateCard(69, "Rocky", "front", "back");
        int numCards = card.getDrawCards(5); // Icon number is 5
        assertEquals(5, numCards);
    }
    // check VP
    @Test
    void getVictoryPoint() {
        assertEquals(2, ClimateCard.getVictoryPoint());
    }

    @Test
    void getAbility() {
        assertEquals("Ability Red", ClimateCard.getAbility());
        ClimateCard.setBackSide();
        assertEquals("Ability Yellow", ClimateCard.getAbility());
        ClimateCard.setBackSide();
    }

    @Test
    void getHabitats() {
        assertEquals("Sunny", ClimateCard.getHabitats());
        assertEquals("Wet", ClimateCard.getHabitats());
        assertEquals("Rocky", ClimateCard.getHabitats());
        assertEquals("Cold", ClimateCard.getHabitats());
    }

   /* @Test
    void setBackSide() {
    }

    */

    @Test
    void isFrontSideChosen() {
        assertTrue(ClimateCard.isFrontSideChosen());
        ClimateCard.setBackSide();
        assertFalse(ClimateCard.isFrontSideChosen());
    }
}