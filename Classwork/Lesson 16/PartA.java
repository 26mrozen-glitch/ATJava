// I got some help from chatgpt with the capitaliation and also specifically for the cleanup method.

import java.util.Scanner;

public class PartA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Partially filled array
        String[] words = new String[20];
        int size = 0;

        // Input loop
        while (true) {
            System.out.print("Enter a word or phrase or 'q' to quit: ");
            String input = scanner.nextLine();

            if (input.equals("q")) {
                break;
            }

            words[size] = input;
            size++;
        }

        // Print original array
        System.out.println("\nWords/Phrases (current size = " + size + "):");
        for (int i = 0; i < size; i++) {
            System.out.println("  " + words[i]);
        }

        // Clean up the array
        cleanup(words, size);

        // Print modified array
        System.out.println("\nModified array...");
        System.out.println("Words/Phrases (current size = " + size + "):");
        for (int i = 0; i < size; i++) {
            System.out.println("  " + words[i]);
        }

        scanner.close();
    }

    // cleanup method
    public static void cleanup(String[] arr, int size) {
        for (int i = 0; i < size; i++) {
            String s = arr[i].trim().toLowerCase();

            if (s.length() > 0) {
                s = s.substring(0, 1).toUpperCase() + s.substring(1);
            }

            arr[i] = s;
        }
    }
}