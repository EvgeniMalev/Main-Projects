package entities.alcohol;

public class Elenska extends BaseAlcohol {
    private final static int MILILITERS = 100;
    private final static int DEGREE = 38;
    private final static String COLOR = "white";
    private final static String YEAR = "2005";
    private final static double PRICE = 20;

    public Elenska() {
        super(MILILITERS, DEGREE, COLOR, YEAR, PRICE);
    }
}
