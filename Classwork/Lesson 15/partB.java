// I used chat gpt to figure out how many target values there were and how to count occurrences of the target value.
import java.util.Scanner;

public class partB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] values = new int[20];  // maximum of 20 values
        int size = 0;              

        // Input loop
        while (size < values.length) {
            System.out.print("Enter an integer value or 'q' to quit: ");

            if (input.hasNext("q") || input.hasNext("Q")) {
                input.next(); // skip over the 'q'
                break;
            } else if (input.hasNextInt()) {
                values[size] = input.nextInt();
                size++;
            } else {
                // skip invalid input
                input.next();
            }
        }

        // Print the partially filled array
        for (int i = 0; i < size; i++) {
            System.out.print(values[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Prompt for target value
        System.out.print("Enter a target integer value: ");
        int target = input.nextInt();

        // Count occurrences of target value
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (values[i] == target) {
                count++;
            }
        }

        // Output result
        System.out.println("The value " + target + " occurs " + count +
                           " times in your original data set.");

        input.close();
    }
}