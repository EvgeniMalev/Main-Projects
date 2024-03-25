package entities.alcohol;

public class Suhindolwine extends BaseAlcohol {
    private final static int MILILITERS = 750;
    private final static int DEGREE = 17;
    private final static String COLOR = "white";
    private final static String YEAR = "2009";
    private final static double PRICE = 15;

    public Suhindolwine() {
        super(MILILITERS, DEGREE, COLOR, YEAR, PRICE);
    }
}
