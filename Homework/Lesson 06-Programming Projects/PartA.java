import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter scale (C for Celsius, F for Fahrenheit): ");
        char scale = scanner.next().charAt(0);

        if (scale == 'C') {
            if (temperature < 0) {
                System.out.println("Water is solid.");
            } else if (temperature >= 0 && temperature <= 100) {
                System.out.println("Water is liquid.");
            } else {
                System.out.println("Water is gaseous.");
            }
        } else if (scale == 'F') {
            double celsius = (temperature - 32) * 5 / 9;
            if (celsius < 0) {
                System.out.println("Water is solid.");
            } else if (celsius >= 0 && celsius <= 100) {
                System.out.println("Water is liquid.");
            } else {
                System.out.println("Water is gaseous.");
            }
        } else {
            System.out.println("Invalid scale.");
        }
    }
}