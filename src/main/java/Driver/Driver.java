package Driver;

import Card.Fauna_Card;
import Database.MySqlAccess;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Driver {
    //Will not be in the final version of the project
//    public static void driver(String[] args) throws FileNotFoundException {
//
//    Scanner read = new Scanner(new File("Island_Cards.txt"));
//
//    read.useDelimiter(", ");
//
//    String title, category;
//    Integer eff1, eff2, eff3, eff4;
//
//    title = read.next();
//    category = read.next();
//    eff1 = read.nextInt();
//    eff2 = read.nextInt();
//    eff3 = read.nextInt();
//    eff4 = read.nextInt();
//
//    Island_Card islandCard = new Island_Card(title, eff1, eff2, eff3, eff4);
//
//    read.close();
//
//    Scanner name = new Scanner(System.in);
//    System.out.print("Enter username: ");
//    String Name = name.nextLine();
//
//    Player player = new Player(Name);
//
//    name.close();
//
//    player.drawCard(islandCard);
//    System.out.print(player.getHandSize());
//    System.out.print(player.getHand());
//
//    Island_Card cardInPlay = player.playCard(0);
//
//    System.out.print("You just played: " + cardInPlay.getName());
//    player.addVP(cardInPlay.getVict());
//    player.addSmallGrowthToken(cardInPlay.getEarth());
//    player.addCompost(cardInPlay.getComp());
//    player.addDirt(cardInPlay.getSoil());
//
//    System.out.print(player.getDirt());
//    System.out.print(player.getSmallGrowthToken());
//    System.out.print(player.getLargeGrowthToken());
//    System.out.print(player.getCompost());
//    System.out.print(player.getVP());
//
//    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //TODO Have schema create database on running Java project. Currently only manually ran schema and tested locally.
        MySqlAccess access = new MySqlAccess();
        access.createConnection();
        Connection conn = access.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Fauna_Card> alFc = new ArrayList<>();

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
                    System.out.print(value);
                }
                if (rs.getString(4).equals("Fauna")) {
                    Fauna_Card fc = new Fauna_Card(rs.getString(6), rs.getString(7), rs.getString(15), Float.parseFloat(rs.getString(16)));
                    alFc.add(fc);
                }
                System.out.print("\n");
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

            for (Fauna_Card fauna_card : alFc) {
                System.out.println(fauna_card.getCardName() + ", " + fauna_card.getObjective());
            }
        }

        printMainMenu();

    }

    private static void printMainMenu() {
        System.out.println("" +
                "\nWelcome to Earth!" +
                "\n0. Quit" +
                "\n1. Play Solo" +
                "\n2. Multiplayer" +
                "\nPlease choose a cmd (0-2): ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

        switch (choice) {
            case "0":
                System.out.println("\nGoodbye!");
                System.exit(0);
            case "1": {
                System.out.println("\nSolo mode");
                System.exit(0);
            }
                // printSoloMenu();
            case "2": {
                System.out.println(
                        "\nMultiplayer mode" +
                                "\n Choose number of players (max 5): "
                );
                int numOfPlayers = Integer.parseInt(sc.nextLine());
                System.out.println(
                        "\n" + numOfPlayers + " players chosen." +
                        "\n 0: Return to main menu" +
                        "\n 1: Continue");
                String multiChoice = sc.nextLine();
                switch(multiChoice) {
                    case "0": {
                        printMainMenu();
                    }
                    case "1": {
                        System.out.println("Starting game...");
                        startGame();
                    }
                }

            }
        }
    }

    private static Player loadPlayers(numOfPlayers){
        for (int i = 0; i < numOfPlayers; i++) {
            System.out.println("What is your username?");
            Scanner sc = new Scanner(System.in);
            String username = sc.nextLine();
            Player player = new Player(username);

            Queue<Player> queue = new LinkedList<>();
            queue.add(player);

        return queue;
    }

    private static Player_Board player_board(Player player){
        // Pull from the stacks of Island Cards, Ecosystem Cards, and Climate Cards (In that order)
        // Input them below this
        Player_Board player_board = new Player_Board(, , ,);

        //This sets the PLayer Board for each player
        player.setBoard(player_board);
    }

    public static Boolean changeTurnStatus(Player currPlayer, Player nextPlayer){
        currPlayer.setTurnStatus(false);
        nextPlayer.setTurnStatus(true);
    }
    private static void startGame() {

    }
}
