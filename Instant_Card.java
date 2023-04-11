package crm;

import java.util.*;
public class Instant_Card {
    private String Name;
    private String Type = "Instant";
    private String Description;
    private int Effect;
    private int VP;
    public Instant_Card(String Name, String Description, int Effect, int VP) {
        this.Name = Name;
        this.Description = Description;
        this.Effect = Effect;
        this.VP = VP;
    }

    public String getName() {return Name;}
    public String getType() {return Type;}
    public String getDescription() {return Description;}
    public int getEffect() {return Effect;}
    public int getVP() {return VP;}
}
