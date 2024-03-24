package entities.food;

public class Kachamak extends BaseFood{
    private final static int CALORIES = 70;
    private final static int CARBONYDRATES = 35;
    private final static int FATS = 8;
    private final static int PROTEINS = 20;
    private final static double PRICE = 6;

    public Sharan() {
        super(CALORIES, CARBONYDRATES, FATS, PROTEINS, PRICE);
    }
}
