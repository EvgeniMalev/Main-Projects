package entities.visitor;

public class Member extends BaseVisitor {
    public Member(String name, String familyName, double budget) {
        super(name, familyName, budget);
    }

    @Override
    public void eat() {
        setBudget(getBudget() - (3.50 * 0.8));
    }

    @Override
    public void drink() {
        setBudget(getBudget() - (5.50 * 0.9));
    }
}
