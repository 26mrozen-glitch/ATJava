import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double totalScore = 0;
        int count = 0;
        try {
            File file = new File("mathmeet.txt");
            Scanner scanner = new Scanner(file);

            System.out.println("Math Meet Scores:");
            System.out.println("--------------------------------------------------");
            System.out.printf("%-20s %-20s %8s\n", "Name", "School", "Score");
            System.out.println("--------------------------------------------------");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                
                String name = parts[0].trim();
                String school = parts[1].trim();
                double score = Double.parseDouble(parts[2].trim());

                System.out.printf("%-20s %-20s %8.2f\n", name, school, score);
                totalScore += score;
                count++;    
            }
        scanner.close();

        double averageScore = totalScore / count;
        System.out.println("--------------------------------------------------");
        System.out.printf("Average Score: %.2f\n", averageScore);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}
