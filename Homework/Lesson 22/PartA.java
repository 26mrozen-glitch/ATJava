import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a filename to read (or # to quit): ");
            String fileName = keyboard.nextLine();
            
            if (fileName.equals("#")) {
                System.out.println("Goodbye!");
                break;
            }
            
            try {
                File file = new File(fileName);
                Scanner fileScanner = new Scanner(file);
                
                while (fileScanner.hasNext()) {
                    String word = fileScanner.next();
                    System.out.println(word);
                }
                
                fileScanner.close();
                System.out.println("Finished reading file.\n");
                
            } catch (FileNotFoundException e) {
                System.out.println("Error: File not found.");
                System.out.println("Please try again.\n");
            }
        }
        
        keyboard.close();
    }
}