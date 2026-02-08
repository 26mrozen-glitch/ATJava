// I used ChatGPT to help refine my printf formatting so the columns aligned correctly and matched the required sample output. I also used it to review my file parsing logic (split, trim, parseDouble, parseInt) to ensure I was extracting and converting the data correctly.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("Top5Unemployment.txt");
        Scanner scanner = new Scanner(file);

        System.out.println("---------------------------------------------------------------");
        System.out.println("                   Top 5 Unemployment Rates");
        System.out.println("---------------------------------------------------------------");

        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
            String[] parts = line.split(",");

            String country = parts[0].trim();
            double rate = Double.parseDouble(parts[1].trim());
            int rank = Integer.parseInt(parts[2].trim());
            String region = parts[3].trim();

          System.out.printf("Ranked # %2d: %-18s |  %5.2f%% | %-22s%n",
            rank, country, rate, region);
        }

        System.out.println("---------------------------------------------------------------");

        scanner.close();
    }
}