import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.HashMap;

public class Terrain_Card {

	private String cardName;
	private int victPoint = 0;
	private int drawEarth = 0;
	private int compCard = 0;
	private int soil = 0;

			public Terrain_Card(String cardName, int victPoint,int drawEarth,int compCard,int soil ) {
				this.cardName = cardName;
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
	
	

