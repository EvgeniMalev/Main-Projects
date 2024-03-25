package entities.alcohol;

public class Dryanovska extends BaseAlcohol {
    private final static int MILILITERS = 100;
    private final static int DEGREE = 40;
    private final static String COLOR = "cechlibar";
    private final static String YEAR = "1990";
    private final static double PRICE = 25;

    public Dryanovska() {
        super(MILILITERS, DEGREE, COLOR, YEAR, PRICE);
    }
}
