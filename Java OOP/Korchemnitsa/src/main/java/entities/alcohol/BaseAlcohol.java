package entities.alcohol;

public abstract class BaseAlcohol implements Alcohol {
    private int mililiters;
    private int degree;
    private String color;
    private String year;
    private double price;

    public BaseAlcohol(int mililiters, int degree, String color, String year, double price) {
        this.mililiters = mililiters;
        this.degree = degree;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    @Override
    public int getMililiters() {
        return mililiters;
    }

    @Override
    public int getDegree() {
        return degree;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getYear() {
        return year;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
