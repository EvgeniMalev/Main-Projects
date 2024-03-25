package entities.alcohol;

public class AppleJuice extends BaseAlcohol {
    private final static int MILILITERS = 300;
    private final static int DEGREE = 0;
    private final static String COLOR = "white yellow";
    private final static String YEAR = "2023";
    private final static double PRICE = 8;

    public AppleJuice() {
        super(MILILITERS, DEGREE, COLOR, YEAR, PRICE);
    }
}
