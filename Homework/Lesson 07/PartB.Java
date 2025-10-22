import java.util.Scanner;

public class PartB {
    // Define an enum for customer type
    enum CustomerType {
        CHILD, ADULT, SENIOR
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Is it Monday? (true/false): ");
        boolean isMonday = scanner.nextBoolean();

        System.out.print("Enter the age of the customer: ");
        int age = scanner.nextInt();

        System.out.print("Enter the cost of the meal: ");
        double mealCost = scanner.nextDouble();

        // Determine customer type based on age
        CustomerType customerType;
        if (age < 13) {
            customerType = CustomerType.CHILD;
        } else if (age >= 50) {
            customerType = CustomerType.SENIOR;
        } else {
            customerType = CustomerType.ADULT;
        }
        double discount = 0;

        // Apply discount based on customer type and whether it's Monday
        switch (customerType) {
            case CHILD:
                discount = isMonday ? 0.075 : 0.05;
                break;
            case ADULT:
                discount = isMonday ? 0.05 : 0.05;
                break;
            case SENIOR:
                discount = isMonday ? 0.15 : 0.075;
                break;
        }
        double discountedCost = mealCost * (1 - discount);
        System.out.printf("The discounted cost is: $%.2f%n", discountedCost);
    }
}