// I used ChatGPT to verify my approach to handling invalid data (replacing "n/a" with 0.0) and to improve the output formatting using printf for proper alignment and currency formatting.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB{

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("sales_by_cat.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
            String[] parts = line.split(",");

            String department = parts[0].trim();
            String manager = parts[1].trim();
            String revenueStr = parts[2].trim();

            double revenue;

            if (revenueStr.equalsIgnoreCase("n/a")) {
                revenue = 0.0;
            } else {
                revenue = Double.parseDouble(revenueStr);
            }

            System.out.printf("%-18s | %-10s | $%10.2f%n",
                    department, manager, revenue);
        }

        scanner.close();
    }
}