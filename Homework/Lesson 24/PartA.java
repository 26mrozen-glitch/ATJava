// I used ChatGPT to review the proper way to instantiate a Scanner object using System.in and to make sure I correctly used the nextLine() and nextInt() methods to collect and print user input. It helped confirm that my syntax and structure were correct.

import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {

        // Declare and initialize Scanner object
        Scanner in = new Scanner(System.in);

        // Get user's name
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Your name is: " + name);

        // Get user's age
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        System.out.println("Your age is: " + age);

        in.close();
    }
}