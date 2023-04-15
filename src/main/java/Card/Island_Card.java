package Card;

import Action.Ability;

import java.util.ArrayList;

public class Island_Card {

		
private String cardName;
private String category;
private Ability ability;
private final ArrayList<String> habitats;
private int victPoint = 0;
private int drawEarth = 0;
private int compCard = 0;
private int soil = 0;

		public Island_Card(String cardName, Ability ability, ArrayList<String> habitats, String category, int victPoint,int drawEarth,int compCard) {
			this.cardName = cardName;
			this.ability = ability;
			this.habitats = habitats;
			this.victPoint = victPoint;
			this.drawEarth= drawEarth;
			this.compCard = compCard;
			this.category = category;
			//this.soil= soil;
			
			
		}
		
		public void setName(String cardName) {
			this.cardName = cardName;
		}

		public void setCategory(String category) {
			this.category = category;
		}
		
		public void setVict(int victPoint) {
			this.victPoint = victPoint;
		}
		public void setEarth(int drawEarth ) {
			this.drawEarth = drawEarth;
		}
		public void setComp(int compCard) {
			this.compCard = compCard;
		}
		
		public void setsoil(int soil) {
			this.soil = soil;
		}
		
		public String getName() {
			return cardName;
		}

	public Ability getAbility() {
			return ability;
	}

	public ArrayList<String> getHabitats() {
		return habitats;
	}

	public int getVict() {
			return victPoint;
		}
		public int getEarth() {
			return drawEarth;
		}
		public int getComp() {
			return compCard;
		}
		
		public int getSoil() {
			return soil;
		}
		
}



