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