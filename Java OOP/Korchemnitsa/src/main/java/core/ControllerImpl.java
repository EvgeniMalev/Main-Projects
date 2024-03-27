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
public String addArea(String areaType, String areaName) {
    // Check if the area already exists
    if (areas.containsKey(areaName)) {
        return "Area already exists.";
    }

    Area newArea;
    switch (areaType.toLowerCase()) {
        case "preslav":
            newArea = new PreslavArea(areaName);
            break;
        case "pliska":
            newArea = new PliskaArea(areaName);
            break;
        case "ohrid":
            newArea = new OhridArea(areaName);
            break;
        default:
            return "Invalid area type.";
    }

    areas.put(areaName, newArea);

    return "Area added successfully.";
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
