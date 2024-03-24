package entities.food.traditional;

public class Sharan extends BaseFood{
    private final static int CALORIES = 70;
    private final static int CARBONYDRATES = 35;
    private final static int FATS = 10;
    private final static int PROTEINS = 30;
    private final static double PRICE = 15;

    public Sharan() {
        super(CALORIES, CARBONYDRATES, FATS, PROTEINS, PRICE);
    }
}
