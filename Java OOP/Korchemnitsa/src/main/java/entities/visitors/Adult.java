package entities.visitor;

public class Adult extends BaseVisitor {
    public Adult(String name, String familyName, double budget) {
        super(name, familyName, budget);
    }

    @Override
    public void eat() {
        setBudget(getBudget() - 4.50);
    }

    @Override
    public void drink() {
        setBudget(getBudget() - 5.50);
    }
}
