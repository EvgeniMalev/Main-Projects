package entities.visitor;

public interface Visitor {
    void setName(String name);
    void setFamilyName(String familyName);
    void eat();
    void drink();
    double getBudget();
    String getName();
    int getYears();
}
