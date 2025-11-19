//There are multiple errors in the original code. The min and max were not initiralzed properly, the average calculation was using integer division, and the letter grade conditions were not in the correct order. 
import java.util.Scanner;
public class PartC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //prompt user for name.
        System.out.print("Enter your name:");
        String name = in.nextLine();

        // Initialize variables
        int total = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        final int COUNT = 4;

        // loop to get scores
        for (int i = 1; i <= COUNT; i++) {
            System.out.print("Enter score" + i + "(0-100):");
            int s = in.nextInt();

            // validate score
            if (s < 0) {
                s = 0;
            } else if (s > 100) {
                s = 100;
            }

            // track the minimum and maximum
            if (s < min) {
                min = s;
            }
            if (s > max) {
                max = s;
            }
            total += s;
        }

        // calculate average
        double average = (double) total / COUNT;

        //determine pass/fail
        boolean passed = average >= 60;

        // display results
        char letter;
        if (average >= 90) {
            letter = 'A';
        } else if (average >= 80) {
            letter = 'B';
        } else if (average >= 70) {
            letter = 'C';
        } else if (average >= 60) {
            letter = 'D';
        } else {
            letter = 'F';
        }

        // Print summary.
        System.out.println("\n----- Report -----");
        System.out.println("Name: " + name);
        System.out.println("Highest single score recorded:" + max);
        System.out.println("Lowest single score recorded:" + min);
        System.out.println("Passed? " + passed);
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Letter Grade: " + letter);
    
        in.close();
    
    }  
}       

