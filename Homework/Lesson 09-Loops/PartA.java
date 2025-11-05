import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double score;
        double total = 0;
        int count = 0;

        System.out.println("Enter test scores one at a time.");
        System.out.println("Enter a negative number to stopm.");

        // loop to get test scores
        System.out.print("Enter a score: ");
        score = input.nextDouble();
        while (score >= 0) {
            total += score;
            count++;

            System.out.print("Enter a score:");
            score = input.nextDouble();

        }

        //After loop: check if any valid scores were entered
        if (count > 0) {
            double average = total / count;
            System.out.println("Number of scores entered: " + count);
            System.out.println("Average score: " + average);
        } else {
            System.out.println("No valid scores were entered!");
        }
    
        input.close();}
}


