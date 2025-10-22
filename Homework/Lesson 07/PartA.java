import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Is it Monday? (true/false): ");
        boolean isMonday = scanner.nextBoolean();

        System.out.print("Enter the age of the customer: ");
        int age = scanner.nextInt();

        System.out.print("Enter the cost of the meal: ");
        double mealCost = scanner.nextDouble();

        double discount = 0;

        if (isMonday) {
            if (age < 13) {
                discount = 0.075;
            } else if (age >= 50) {
                discount = 0.15;
            } else {
                discount = 0.05;
            }
        } else {
            if (age < 13) {
                discount = 0.05;
            } else if (age >= 50) {
                discount = 0.075;
            } else {
                discount = 0.05;
            }
        }

        double discountedCost = mealCost * (1 - discount);
        System.out.printf("The discounted cost is: $%.2f%n", discountedCost);
    }
}