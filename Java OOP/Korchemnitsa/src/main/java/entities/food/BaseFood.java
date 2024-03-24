package entities.food;

public abstract class BaseFood implements Food {
    private int calories;
    private int carbohydrates;
    private int fats;
    private int proteins;
    private double price;

    public BaseFood(int calories, int carbohydrates,int fats, int proteins, double price) {
        this.calories = calories;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.proteins = proteins;
        this.price = price;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public int getCarbohydrates() {
        return carbohydrates;
    }

    @Override
    public int getFats() {
        return fats;
    }

    @Override
    public int getProteins() {
        return proteins;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

