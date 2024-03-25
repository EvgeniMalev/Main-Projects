package entities.alcohol;

public class Lyaskovskowine extends BaseAlcohol {
    private final static int MILILITERS = 750;
    private final static int DEGREE = 18;
    private final static String COLOR = "red";
    private final static String YEAR = "2008";
    private final static double PRICE = 14;

    public Lyaskovskowine() {
        super(MILILITERS, DEGREE, COLOR, YEAR, PRICE);
    }
}
