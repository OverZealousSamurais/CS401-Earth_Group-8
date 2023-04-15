package Card;

import java.util.ArrayList;

public class Terrain_Card {

	private String cardName;
	private ArrayList<String> habitats;
	private int victPoint = 0;
	private int drawEarth = 0;
	private int compCard = 0;
	private int soil = 0;

			public Terrain_Card(String cardName, ArrayList<String> habitats, int victPoint,int drawEarth,int compCard,int soil ) {
				this.cardName = cardName;
				this.habitats = habitats;
				this.victPoint = victPoint;
				this.drawEarth= drawEarth;
				this.compCard = compCard;
				this.soil= soil;
			}
			
			public void setName(String cardName) {
				this.cardName = cardName;
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
	
	

