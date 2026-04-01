public class Manager extends Employee {
    private double bonus;

    // Constructor
    public Manager(String name, double salary, double bonus) {
        super(name, salary);  // calls Employee constructor to set name and salary
        this.bonus = bonus;
    }

    // Override getAnnualIncome to include bonus
    @Override
    public double getAnnualIncome() {
        return getSalary() + bonus;  // getSalary() is inherited from Employee
    }
}



