package entities.food.traditional;

public class Lozovisarmi extends BaseFood{
    private final static int CALORIES = 70;
    private final static int CARBONYDRATES = 50;
    private final static int FATS = 8;
    private final static int PROTEINS = 22;
    private final static double PRICE = 10;

    public Lozovisarmi() {
        super(CALORIES, CARBONYDRATES, FATS, PROTEINS, PRICE);
    }
}
