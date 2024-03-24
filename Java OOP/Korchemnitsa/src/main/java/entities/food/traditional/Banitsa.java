package entities.food.traditional;

public class Banitsa extends BaseFood{
    private final static int CALORIES = 70;
    private final static int CARBONYDRATES = 23;
    private final static int FATS = 13;
    private final static int PROTEINS = 20;
    private final static double PRICE = 10;

    public Banitsa() {
        super(CALORIES, CARBONYDRATES, FATS, PROTEINS, PRICE);
    }
}
