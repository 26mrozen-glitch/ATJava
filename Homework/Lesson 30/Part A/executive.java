public class executive extends Manager {
    private double shares;

    /*
     * Constructor
     */
    public Executive(String name, double salary, double bonus, double shares) {
        super(name, salary, bonus);
        this.shares = shares;
    }

    public double getShares() {
        return shares;
    }

    public void setShares(double newShares) {
        shares = newShares;
    }

    /*
     * Override displayInfo
     */
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("  Shares = %,12.2f%n", shares);
    }
}