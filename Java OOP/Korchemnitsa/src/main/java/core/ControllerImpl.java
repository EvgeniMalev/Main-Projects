package core;

import entities.area.Area;
import entities.food.Food;
import entities.alcohol.Alcohol;
import entities.visitor.Visitor;

import java.util.Map;

public class ControllerImpl implements Controller {
    private final Map<String, Area> areas;

    public ControllerImpl(Map<String, Area> areas) {
        this.areas = areas;
    }

    @Override
    public String addVisitorAndEat(String areaName, Visitor visitor, Food food, Alcohol alcohol) {
        Area area = areas.get(areaName);
        if (area == null) {
            return "Area not found.";
        }

  
        area.addVisitor(visitor);

        area.addFood(food);
        area.addAlcohol(alcohol);

        area.eat();

        return "Visitor added and fed successfully.";
    }

    @Override
    public String calculateBudget(String areaName) {
        Area area = areas.get(areaName);
        if (area == null) {
            return "Area not found.";
        }

        double totalBudget = area.getVisitor().stream().mapToDouble(Visitor::getBudget).sum();
        return String.format("Total budget spent in %s: %.2f", areaName, totalBudget);
    }

    @Override
    public String calculateAvgCaloriesPerVisitor() {
        double totalCalories = areas.values().stream()
                .flatMap(area -> area.getVisitor().stream())
                .mapToDouble(Visitor::getCaloriesConsumed)
                .sum();

        long totalVisitors = areas.values().stream()
                .flatMap(area -> area.getVisitor().stream())
                .count();

        double avgCaloriesPerVisitor = totalVisitors == 0 ? 0 : totalCalories / totalVisitors;
        return String.format("Average calories per visitor: %.2f", avgCaloriesPerVisitor);
    }
}
