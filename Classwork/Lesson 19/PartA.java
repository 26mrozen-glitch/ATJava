import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        ArrayList<Integer> temps = new ArrayList<>();
        int lowest = Integer.MAX_VALUE;

        try {
            // Open the file
            File file = new File("temps.txt");
            Scanner input = new Scanner(file);

            // Read values into ArrayList and track lowest temp
            while (input.hasNextInt()) {
                int temp = input.nextInt();
                temps.add(temp);

                if (temp < lowest) {
                    lowest = temp;
                }
            }

            // Close the file
            input.close();

            // Print temperatures and mark lowest
            for (int temp : temps) {
                if (temp == lowest) {
                    System.out.printf("%4d <= lowest%n", temp);
                } else {
                    System.out.printf("%4d%n", temp);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}