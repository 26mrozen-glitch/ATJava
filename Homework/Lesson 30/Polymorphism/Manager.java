// This code was completed with assistance from ChatGPT and general online resources. These sources were used to help clarify concepts such as inheritance, method overriding, and using super to access parent class methods.

package Polymorphism;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);

        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double newBonus) {
        bonus = newBonus;
    }

    public double getAnnualIncome() {
        return super.getAnnualIncome() + getBonus();
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.printf("  Bonus  = $%,12.2f%n", bonus);
    }
}


