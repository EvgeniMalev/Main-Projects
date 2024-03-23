package entities.area;

import entities.visitor.Visitor;
import entities.food.Food;
import entities.drink.Drink;

import java.util.Collection;

public interface Area {
    double calculateBill();
    String getName();
    void addVisitor(Visitor visitor);
    void removeVisitor(Visitor visitor);
    void addFood(Food food);
    void addDrink(Drink drink);
    void eat();
    void drink();
    String getInfo();
    Collection<Visitor> getVisitors();
    Collection<Food> getFoods();
    Collection<Drink> getDrinks();
}
