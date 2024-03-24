package entities.food.traditional;

public class Svinsko extends BaseFood{
    private final static int CALORIES = 70;
    private final static int CARBONYDRATES = 35;
    private final static int FATS = 62;
    private final static int PROTEINS = 30;
    private final static double PRICE = 13;

    public Svinsko() {
        super(CALORIES, CARBONYDRATES, FATS, PROTEINS, PRICE);
    }
}
