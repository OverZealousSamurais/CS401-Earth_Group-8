public class Player {
    protected String name;
    private Integer dirt;
    private Integer smallGrowthToken;
    private Integer largeGrowthToken;
    private Integer vp;


    public void setName(String Name){
        this.name = Name;
    }

    public void addDirt(Integer Dirt){
        this.dirt = Dirt + this.dirt;
    }

    public void addSmallGrowthToken(Integer SGT){
        this.smallGrowthToken = SGT + this.smallGrowthToken;
    }

    public void addLargeGrowthToken(Integer LGT){
        this.largeGrowthToken = LGT + this.largeGrowthToken;
    }

    public void addVP(Integer VP){
        this.vp = vp + this.vp;
    }
}
