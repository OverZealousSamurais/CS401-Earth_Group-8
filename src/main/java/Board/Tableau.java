package Board;

import Card.Flora_Card;
import Card.Terrain_Card;

import java.util.ArrayList;

public class Tableau {
    private Object[][] board;
    private ArrayList<Flora_Card> plantedFlora;
    private ArrayList<Terrain_Card> plantedTerrain;

    public Tableau(Object[][] board, ArrayList<Flora_Card> plantedFlora, ArrayList<Terrain_Card> plantedTerrain) {
        this.board = board;
        this.plantedFlora = plantedFlora;
        this.plantedTerrain = plantedTerrain;
    }

    public Object[][] getBoard() {
        return board;
    }

    public void placeTerrain(Terrain_Card terr, int x, int y) {
        if (board[x][y] == null) {
            board[x][y] = terr;
        } else {
            System.out.println("\nThat slot is filled, choose another.");
        }
    }

    public void placeFlora(Flora_Card flora, int x, int y) {
        if (board[x][y] == null) {
            board[x][y] = flora;
        } else {
            System.out.println("\nThat slot is filled, choose another.");
        }
    }

    public ArrayList<Flora_Card> getPlantedFlora() {
        return plantedFlora;
    }

    public ArrayList<Terrain_Card> getPlantedTerrain() {
        return plantedTerrain;
    }

    public ArrayList<Object> getCol(int index) {
        ArrayList<Object> col = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            col.add(board[i][index]);
        }
        return col;
    }

    public boolean checkDiagonals() {
        ArrayList<Object> diag1 = new ArrayList<>();
        ArrayList<Object> diag2 = new ArrayList<>();
        for (int i = 0, j = 0; i < board.length && j < board.length; i++, j++) {
            diag1.add(getBoard()[i][j]);
        }
        for (int i = 3, j = 0; i > 0 && j < board.length; i--, j++) {
            diag2.add(getBoard()[i][j]);
        }
        return (!diag1.contains(null) && !diag2.contains(null));
    }
}
