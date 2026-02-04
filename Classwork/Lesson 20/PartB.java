// I used ChatGPT to help design the logic for reading a file character by character and determining how to ount letters and digits using built-in Character methods

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PartB {
    public static void main(String[] args) throws IOException {

        File file = new File("characters.txt");
        FileReader reader = new FileReader(file);

        int character;
        int count = 0;
        int letters = 0;
        int digits = 0;

        // Read file character by character
        while ((character = reader.read()) != -1) {
            char ch = (char) character;
            System.out.print(ch);

            count++;

            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            }
        }

        reader.close();

        System.out.println();
        System.out.println("count = " + count);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
    }
}
    

