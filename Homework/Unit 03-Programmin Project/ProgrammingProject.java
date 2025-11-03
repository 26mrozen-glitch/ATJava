
// I used ChatGPT to help with the output formatting as well as how to go about completeing the discount calculations after struggling with them for a bit.
// I had Mr.Eng help with formatting the base price. 

import java.util.Scanner;

public class ProgrammingProject {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter the first three letters of the day of the week: ");
            String dayInput = scanner.nextLine().toLowerCase();

            System.out.print("Enter the time (HH:MM): ");
            String rawTime = scanner.nextLine().trim();

            int hour = 0;
            int min = 0;

            if (rawTime.contains(":")) {
                int i = rawTime.indexOf(":");
                hour = Integer.parseInt(rawTime.substring(0, i));
                min = Integer.parseInt(rawTime.substring(i + 1));
            } else {
                System.err.println(" Unable to anlyze time, stopping program.");
                return;
            }
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Are you a student? (y/n): ");
            String studentInput = scanner.nextLine().toLowerCase();
            boolean isStudent = studentInput.equals("y");

            // Validate day input
            String day;
            switch (dayInput) {
                case "monday", "mon" -> day = "MON";
                case "tuesday", "tue" -> day = "TUE";
                case "wednesday", "wed" -> day = "WED";
                case "thursday", "thu" -> day = "THU";
                case "friday", "fri" -> day = "FRI";
                case "saturday", "sat" -> day = "SAT";
                case "sunday", "sun" -> day = "SUN";
                default -> {
                    System.out.println("Error: Invalid day entered.");
                    return;
                }
            }
            
            // Determine base price
            double basePrice = 0.0;
            double ageDiscount = 0.0;
            double studentDiscount = 0.0;
        
            if (day.equals ("SAT") || day.equals("SUN")) {
                basePrice = 80.00;
            } else {
                if ((hour >= 6 && hour <8) || (hour >= 16 && hour < 18)){
                    basePrice = 100.00;
                }else {
                    basePrice = 90.00;
                }
            }
            
            // Age discount
            if (age >= 0 && age <= 2) {
                ageDiscount = basePrice; // Free
            } else if (age >= 3 && age <= 12) {
                ageDiscount = basePrice * 0.20; // 20% discount
            } else if (age >= 60) {
                ageDiscount = basePrice * 0.25; // 25% discount
            }

            // Student discount
            if (isStudent) {
                studentDiscount = 5.00;
            }

            // Final price
            double finalPrice = basePrice - ageDiscount - studentDiscount;

            // Output
            System.out.println("--------------------------------------------------");
            System.out.printf("Name: %s\nDay: %s\nTime: %02d:%02d\n", name, day, hour, min);
            System.out.println("--------------------------------------------------");
            System.out.printf("Base Price:        $%.2f\n", basePrice);
            System.out.printf("Age Discount:      $%.2f\n", ageDiscount);
            System.out.printf("Student Discount:  $%.2f\n", studentDiscount);
            System.out.println("--------------------------------------------------");
            System.out.printf("Final Price:       $%.2f\n", finalPrice);
        }
    }
}