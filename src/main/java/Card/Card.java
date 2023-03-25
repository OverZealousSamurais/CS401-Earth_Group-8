package Card;
import java.sql.*;

public abstract class Card {
    private String name;
    public int soilCost;
    private String soil;

    public Card(String name, int soilCost) throws SQLException {
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
