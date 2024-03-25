package core;

public interface Controller {
    String addArea(String areaType, String areaName);
    String buyFood(String type);
    String foodForArea(String areaName, String foodType);

    String feedVisitor(String areaName);
    String calculateBudget(String areaName);
    String getStatistics();

    String addVisitor(String areaName, String visitorType, String visitorName, String familyName, double budget);
}
