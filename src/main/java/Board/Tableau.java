package Board;

import Card.Flora_Card;
import Card.Terrain_Card;

public class Tableau {
    Object[][] tableau;

    public Tableau(Object[][] tableau) {
        this.tableau = tableau;
    }

    public void placeTerrain(Terrain_Card terr, int x, int y) {
        if (tableau[x][y] == null) {
            tableau[x][y] = terr;
        }
    }

    public void placeFlora(Flora_Card flora, int x, int y) {
        if (tableau[x][y] == null) {
            tableau[x][y] = flora;
        }
    }
}
