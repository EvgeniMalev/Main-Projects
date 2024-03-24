package entities.food.traditional;

public class Bulgur extends BaseFood{
    private final static int CALORIES = 70;
    private final static int CARBONYDRATES = 45;
    private final static int FATS = 12;
    private final static int PROTEINS = 30;
    private final static double PRICE = 8;

    public Bulgur() {
        super(CALORIES, CARBONYDRATES, FATS, PROTEINS, PRICE);
    }
}
