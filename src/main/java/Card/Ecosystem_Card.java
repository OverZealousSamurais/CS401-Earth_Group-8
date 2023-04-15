package Card;

public class Ecosystem_Card {
	private String cardName;
	private int victoryPoint;
	private boolean objective = False;
	private Ability ability;
	private String objectiveDescription;

	public Ecosystem_Card(String cardName, int victoryPoint, String objectiveDescription){
		this.cardName = cardName;
		this.victoryPoint = victoryPoint;
		this.objectiveDescription = objectiveDescription;
	}

	public int getCardName(){
		return this.cardName;
	}

	public int getVictoryPoint(){
		if (this.objective == True){
			return this.victoryPoint;
		} else {
			System.out.println("Objective conditions have not been satisfied");
		}
	}

	public String getObjectiveDescription(){
		return this.objectiveDescription;
	}
}