
import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        System.out.print("Enter the third string: ");
        String str3 = scanner.nextLine();

        // Create an array of the strings
        String[] strings = {str1, str2, str3};

        // Sort the strings in lexicographic order
        java.util.Arrays.sort(strings);

        // Display the sorted strings
        System.out.println("Strings in lexicographic order:");
        for (String s : strings) {
            System.out.println(s);
        }
    }
}