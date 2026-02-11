//I used ChatGPT to help me format the program correctly, use Integer.parseInt() to convert a String to an int, and implement a try–catch statement to handle the NumberFormatException when the birth year was listed as n/a.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {

    public static void main(String[] args) {

        try {
            File file = new File("birthyears.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                // Each word is separated by a comma.
                String[] parts = line.split(",");

                if (parts.length == 2) {
                    String name = parts[0].trim();
                    String birthYearStr = parts[1].trim();

                    try {
                        int birthYear = Integer.parseInt(birthYearStr);
                        System.out.println(name + " was born in " + birthYear + ".");
                    } catch (NumberFormatException e) {
                        System.out.println("I do not know what year " + name + " was born.");
                        
                    }
                }
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}