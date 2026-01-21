// I used chat gpt to help me with printing the values with asterisks and printing values in reverse order which are seperated by commas.

import java.util.Arrays;
import java.util.Scanner;

public class partA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] values = new int[10];   // maximum of 10 values
        int size = 0;                 // current number of valid values

        // Input loop
        while (size < values.length) {
            System.out.print("Enter an integer or 'q' to quit: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                values[size] = number;
                size++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'q'.");
            }
        }

        // Print values with asterisks
        System.out.print("*");
        for (int i = 0; i < size; i++) {
            System.out.print(values[i] + "*");
        }
        System.out.println();

        // Sort only the valid portion of the array
        Arrays.sort(values, 0, size);

        // Print values in reverse order, separated by commas
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(values[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        scanner.close();
    }
}