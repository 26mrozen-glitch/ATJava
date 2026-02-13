// I used ChatGPT to help clarify how to properly throw a NumberFormatException when the input is either outside the allowed range (0–100) or cannot be parsed into an integer. Specifically, I received guidance on structuring the try-catch block inside the method and on demonstrating exception handling in the main method using a try-catch statement.

import java.util.Scanner;

public class PartA {

    public static int getQuizScore(Scanner in) {
        System.out.print("Enter a quiz score (0-100): ");
        
        String input = in.nextLine();
        
        try {
            int score = Integer.parseInt(input);
            
            if (score < 0 || score > 100) {
                throw new NumberFormatException("Score out of range.");
            }
            
            return score;
            
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid quiz score.");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            int quizScore = getQuizScore(in);
            System.out.println("Valid quiz score entered: " + quizScore);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        in.close();
    }
}