package entities.food.vegetable;

public class Mulyanka extends BaseFood{
    private final static int CALORIES = 70;
    private final static int CARBONYDRATES = 34;
    private final static int FATS = 10;
    private final static int PROTEINS = 16;
    private final static double PRICE = 7;

    public Mulyanka() {
        super(CALORIES, CARBONYDRATES, FATS, PROTEINS, PRICE);
    }
}
