import java.util.Scanner;
// I used ChatGPT to help me make sure my code was printing out in an organized way specificallyt in the helper method and to help me with the remove and insert methods.

public class modified {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] scores = new double[10];
        int count = 0;
        double sum = 0;
        double max = Double.MIN_VALUE;

        System.out.println("Enter test scores (or 'q' to quit):");

        // Input loop
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

            System.out.println("\n--- Scores Summary ---");
            System.out.println("Number of scores entered: " + count);
            System.out.printf("Average score: %.2f%n", average);
            System.out.printf("Maximum score: %.2f%n", max);

            // Demonstrating remove()
            System.out.println("\nRemoving score at index 1...");
            count = remove(scores, count, 1); // remove second score (index 1)
            printScores(scores, count);

            // Demonstrating insert()
            System.out.println("\nInserting score 99.5 at index 1...");
            count = insert(scores, count, 1, 99.5); // insert 99.5 at index 1
            printScores(scores, count);

        } else {
            System.out.println("\nNo test scores were entered.");
        }

        scanner.close();
    }

    // Part A: Remove method
    public static int remove(double[] array, int currentSize, int targetIndex) {
        if (targetIndex < 0 || targetIndex >= currentSize) {
            // invalid index, return current size
            System.out.println("Invalid index for removal.");
            return currentSize;
        }

        for (int i = targetIndex; i < currentSize - 1; i++) {
            array[i] = array[i + 1]; // shift elements left
        }
        array[currentSize - 1] = 0; // optional: clear last element
        return currentSize - 1; // updated size
    }

    // Part B: Insert method
    public static int insert(double[] array, int currentSize, int targetIndex, double newElement) {
        if (currentSize >= array.length) {
            System.out.println("Array is full. Cannot insert.");
            return currentSize;
        }

        if (targetIndex < 0 || targetIndex > currentSize) {
            System.out.println("Invalid index for insertion.");
            return currentSize;
        }

        // Shift elements to the right to make space
        for (int i = currentSize; i > targetIndex; i--) {
            array[i] = array[i - 1];
        }

        array[targetIndex] = newElement;
        return currentSize + 1; // updated size
    }

    // Helper method to print scores neatly
    public static void printScores(double[] array, int size) {
        System.out.print("Scores: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}