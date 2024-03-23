package entities.area;

import entities.visitor.Visitor;
import entities.food.Food;
import entities.drink.Drink;

import java.util.ArrayList;
import java.util.Collection;

public abstract class BaseArea implements Area {
    private String name;
    private int tableCapacity;
    private Collection<Food> foods;
    private Collection<Drink> drinks;
    private Collection<Visitor> visitors;

    protected BaseArea(String name, int tableCapacity) {
        this.name = name;
        this.tableCapacity = tableCapacity;
        this.visitors = new ArrayList<>();
        this.foods = new ArrayList<>();
        this.drinks = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        double totalBill = 0;
        for (Visitor visitor : visitors) {
            totalBill += visitor.getBudget();
        }
        for (Food food : foods) {
            totalBill += food.getPrice();
        }
        for (Drink drink : drinks) {
            totalBill += drink.getPrice();
        }
        return totalBill;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addVisitor(Visitor visitor) {
        if (visitors.size() < tableCapacity) {
            visitors.add(visitor);
        } else {
            throw new IllegalStateException("Cannot add visitor. Area is at full capacity.");
        }
    }

    @Override
    public void removeVisitor(Visitor visitor) {
        visitors.remove(visitor);
    }

    @Override
    public void addFood(Food food) {
        foods.add(food);
    }

    @Override
    public void addDrink(Drink drink) {
        drinks.add(drink);
    }
}
