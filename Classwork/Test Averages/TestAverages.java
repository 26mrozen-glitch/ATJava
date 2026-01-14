import java.util.Scanner;
//I had soeme help from chatgpt to complete the part of the program for it to recognize that when 'q' is entered it will quit the program and when i list out the scores just to make it look cleaner and easier to follow


public class TestAverages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] scores = new double[10];
        int count = 0;
        double sum = 0;
        double max = Double.MIN_VALUE;

        System.out.println("Enter test scores (or 'q' to quit):");

        while (count < scores.length) {
            System.out.print("Score " + (count + 1) + ": ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                double score = Double.parseDouble(input);
                scores[count] = score;
                sum += score;

                if (score > max) {
                    max = score;
                }

                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'q'.");
            }
        }

        if (count > 0) {
            double average = sum / count;

            System.out.println("Number of scores entered: " + count);
            System.out.printf("Average score: %.2f%n", average);
            System.out.printf("Maximum score: %.2f%n", max);
        } else {
            System.out.println("\nNo test scores were entered.");
        }

        scanner.close();
    }
}