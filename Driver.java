package crm;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

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
}
