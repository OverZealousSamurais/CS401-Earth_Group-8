package Action;

public abstract class Ability {
    private String color;

    public abstract void ability(Object obj1, Object obj2, int num, String action);

    public String getColor() {
        return color;
    }
}
