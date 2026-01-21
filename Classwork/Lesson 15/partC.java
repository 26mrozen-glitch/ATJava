// I used chat gpt to help me with generating random target values and timing linear vs binary search.
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class partC {

    public static void main(String[] args) {

        final int ARRAY_SIZE = 10000;
        int[] values = new int[ARRAY_SIZE];
        Random rand = new Random();

        // Fill the array with random integers between 1 and ARRAY_SIZE
        for (int i = 0; i < ARRAY_SIZE; i++) {
            values[i] = rand.nextInt(ARRAY_SIZE) + 1;
        }

        // Sort the array for binary search
        Arrays.sort(values);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of target values to test: ");
        int testCount = scanner.nextInt();

        for (int i = 0; i < testCount; i++) {

            int targetValue = rand.nextInt(ARRAY_SIZE) + 1;

            // Time linear search
            long startTime = System.nanoTime();
            boolean foundLinear = linearSearch(values, targetValue);
            long linearDuration = System.nanoTime() - startTime;

            // Time binary search
            startTime = System.nanoTime();
            int index = Arrays.binarySearch(values, targetValue);
            boolean foundBinary = index >= 0;
            long binaryDuration = System.nanoTime() - startTime;

            // Output results
            System.out.printf(
                "Target Value: %d | Linear Search: %s (Time: %d ns) | Binary Search: %s (Time: %d ns)%n",
                targetValue,
                foundLinear ? "Found" : "Not Found", linearDuration,
                foundBinary ? "Found" : "Not Found", binaryDuration
            );
        }

        scanner.close();
    }

    public static boolean linearSearch(int[] array, int tgtVal) {
        for (int value : array) {
            if (value == tgtVal) {
                return true;
            }
        }
        return false;
    }
}