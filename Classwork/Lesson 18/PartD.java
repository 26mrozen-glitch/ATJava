// I had ChatGPT assist with removing elements from an ArrayList while looping.

import java.util.ArrayList;
import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.print("Enter an integer (q to quit): ");
            String value = input.nextLine();

            if (value.equalsIgnoreCase("q")) {
                break;
            }

            numbers.add(Integer.parseInt(value));
        }

        // Remove odd numbers
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) % 2 != 0) {
                numbers.remove(i);
            }
        }

        System.out.println("Even numbers only:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}