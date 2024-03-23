package entities.visitor;

public abstract class BaseVisitor implements Visitor {
    private String name;
    private String familyName;
    private double budget;

    public BaseVisitor(String name, String familyName, double budget) {
        this.setName(name);
        this.setFamilyName(familyName);
        this.setBudget(budget);
    }

    @Override
    public void setName(String name) {
        if (ifNullOrEmptyString(name)) {
            throw new NullPointerException("Name cannot be null or empty");
        }
        this.name = name;
    }

    @Override
    public void setFamilyName(String familyName) {
        if (ifNullOrEmptyString(familyName)) {
            throw new NullPointerException("Family name cannot be null or empty");
        }
        this.familyName = familyName;
    }

    private boolean ifNullOrEmptyString(String str) {
        return str == null || str.trim().isEmpty();
    }

    @Override
    public abstract void eat(); 

    @Override
    public abstract void drink(); 

    @Override
    public double getBudget() {
        return budget;
    }

    protected void setBudget(double budget) {
        if (budget <= 0) {
            throw new IllegalArgumentException("Budget price cannot be below or equal to zero");
        }
        this.budget = budget;
    }
}
