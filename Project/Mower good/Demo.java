// I used ChatGPT and internet resources to help understand how to take user input, create an object from another class, and display the output. I used this guidance to write and organize the demo program myself.

import Mow.Yard;
import java.util.Scanner;

public class Demo {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        clearScreen();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the yard: ");
        int height = scanner.nextInt();

        System.out.print("Enter the width of the yard: ");
        int width = scanner.nextInt();

        System.out.println();

        // Create and display the yard
        Yard yard = new Yard(height, width);
        yard.printYard(); 

        scanner.close();
    }
}




