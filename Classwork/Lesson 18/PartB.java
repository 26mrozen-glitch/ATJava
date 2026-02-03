// I had ChatGPT assist with handling user input and calculating the average
import java.util.ArrayList;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<>();

        while (true) {
            System.out.print("Enter a test score (q to quit): ");
            String value = input.nextLine();

            if (value.equalsIgnoreCase("q")) {
                break;
            }

            scores.add(Double.parseDouble(value));
        }

        double sum = 0;

        System.out.println("Test Scores:");
        for (double score : scores) {
            System.out.printf("%.2f%n", score);
            sum += score;
        }

        if (scores.size() > 0) {
            double average = sum / scores.size();
            System.out.printf("Average: %.2f%n", average);
        } else {
            System.out.println("No scores entered.");
        }
    }
}