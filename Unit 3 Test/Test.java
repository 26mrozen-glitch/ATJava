import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error: input must be an integer.");
            
        }
        int a = scanner.nextInt();

        System.out.print("Enter side 2: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error: input must be an integer.");    
        }
        int b = scanner.nextInt();

        System.out.print("Enter side 3: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error: input must be an integer.");   
        }
        int c = scanner.nextInt();

        // Check if sides are positive
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Error: all side lengths must be greater than 0.");
        }

        // First: check if it forms a triangle
        if (a + b > c && a + c > b && b + c > a) {

            // Equilateral: all three sides equal
            if (a == b && b == c) {
                System.out.println("equilateral");
            }
            // Isosceles: exactly two sides equal
            else if (a == b || a == c || b == c) {
                System.out.println("isoceles");
            }
            // Scalene: all sides different
            else if (a != b && a != c && b != c) {
                System.out.println("scalene");
            }

        } else {
            System.out.println("not a triangle");
        }

        scanner.close();
    }
}
