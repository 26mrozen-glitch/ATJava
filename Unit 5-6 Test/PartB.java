
   import java.util.ArrayList;
   import java.util.Scanner;

public class PartB {   
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<>();

        System.out.println("Enter quiz scores (enter 'q' to quit):");

        while (true) {
            String userInput = input.nextLine();

            if (userInput.equalsIgnoreCase("q")) {
                break;
            }

            try {
                double score = Double.parseDouble(userInput);
                scores.add(score);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'q' to quit.");
            }
        }

        // Part A: Print scores neatly formatted
        System.out.println("Quiz Scores:");
        double sum = 0;

        for (double score : scores) {
            System.out.printf("%6.2f%n", score);
            sum += score;
        }

        // Part B: Calculate and display average
        if (scores.size() > 0) {
            double average = sum / scores.size();
            System.out.printf("Average Score: %6.2f%n", average);
        } else {
            System.out.println("No scores entered.");
        }

        input.close();
    }
}