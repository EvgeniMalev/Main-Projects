package entities.visitor;

public class Child extends BaseVisitor {
    public Child(String name, String familyName, double budget) {
        super(name, familyName, budget);
    }

    @Override
    public void eat() {
        setBudget(getBudget() - (2.50 * 0.9));
    }

    @Override
    public void drink() {
        setBudget(getBudget() - (5.50 * 0.9));
    }
}
