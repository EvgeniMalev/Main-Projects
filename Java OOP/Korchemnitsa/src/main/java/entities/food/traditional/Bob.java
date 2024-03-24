package entities.food.traditional;

public class Bob extends BaseFood{
    private final static int CALORIES = 70;
    private final static int CARBONYDRATES = 55;
    private final static int FATS = 12;
    private final static int PROTEINS = 30;
    private final static double PRICE = 7;

    public Bob() {
        super(CALORIES, CARBONYDRATES, FATS, PROTEINS, PRICE);
    }
}
