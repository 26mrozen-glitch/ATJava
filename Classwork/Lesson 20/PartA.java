//ChatGPT was used to help review and refine this program, specifically to verify correct Scanner delimiters, formatting with printf, and alignment of output to match the requirements

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws IOException {

        File file = new File("customerdata.txt");
        Scanner input = new Scanner(file);

        input.useDelimiter("[,\\s\\n]+");

        System.out.println("---------------------------------------");
        System.out.printf("%6s  | %10s     | %12s%n", "ID", "Name", "Balance");
        System.out.println("---------------------------------------");

        while (input.hasNext()) {
            int id = input.nextInt();
            String name = input.next();
            double balance = input.nextDouble();

            System.out.printf(
                "%06d | %11s | $%,12.2f%n",
                id, name, balance
            );
        }

        input.close();
    }
}

