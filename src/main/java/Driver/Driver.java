package Driver;

import Card.*;
import Player.*;
import database.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;

class Driver {
    //Will not be in the final version of the project
    public static void driver(String[] args) throws FileNotFoundException {

    Scanner read = new Scanner(new File("Island_Cards.txt"));

    read.useDelimiter(", ");

    String title, category;
    Integer eff1, eff2, eff3, eff4;

    title = read.next();
    category = read.next();
    eff1 = read.nextInt();
    eff2 = read.nextInt();
    eff3 = read.nextInt();
    eff4 = read.nextInt();

    Island_Card islandCard = new Island_Card(title, eff1, eff2, eff3, eff4);

    read.close();

    Scanner name = new Scanner(System.in);
    System.out.print("Enter username: ");
    String Name = name.nextLine();

    Player player = new Player(Name);
    
    name.close();

    player.drawCard(islandCard);
    System.out.print(player.getHandSize());
    System.out.print(player.getHand());

    Island_Card cardInPlay = player.playCard(0);

    System.out.print("You just played: " + cardInPlay.getName());
    player.addVP(cardInPlay.getVict());
    player.addSmallGrowthToken(cardInPlay.getEarth());
    player.addCompost(cardInPlay.getComp());
    player.addDirt(cardInPlay.getSoil());

    System.out.print(player.getDirt());
    System.out.print(player.getSmallGrowthToken());
    System.out.print(player.getLargeGrowthToken());
    System.out.print(player.getCompost());
    System.out.print(player.getVP());

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //TODO Have schema create database on running Java project. Currently only manually ran schema and tested locally.
        MySqlAccess access = new MySqlAccess();
        access.createConnection();
        Connection conn = access.getConnection();
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM cards");

            if (stmt.execute("SELECT * FROM cards")) {
                rs = stmt.getResultSet();
            }

            ResultSetMetaData rsmd = rs.getMetaData();
            int columns = rsmd.getColumnCount();
            while(rs.next()) {
                for (int i = 1; i <= columns; i++) {
                    if (i > 1) System.out.print(", ");
                    String value = rs.getString(i);
                    System.out.print(value + " " + rsmd.getColumnName(i));
                }
                System.out.print("");
            }

        } catch (SQLException e) {
            // handle any errors
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignored) { } // ignore

                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ignored) { } // ignore

                stmt = null;
            }
        }
    }
}
