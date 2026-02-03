// I had ChatGPT assist me with structuring the input loop and ArrayList usage.

import java.util.ArrayList;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            System.out.print("Enter a name (# to quit): ");
            String name = input.nextLine();

            if (name.equals("#")) {
                break;
            }

            names.add(name);
        }

        System.out.println("Names entered:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}