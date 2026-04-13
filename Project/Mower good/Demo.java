import Mow.Yard;
import Mow.Mower;
import java.util.Scanner;

public class Demo {

    // Clear screen for animation
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Delay execution (milliseconds)
    public static void delay(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the yard: ");
        int height = scanner.nextInt();

        System.out.print("Enter the width of the yard: ");
        int width = scanner.nextInt();

        System.out.println();

        // Create the yard
        Yard yard = new Yard(height, width);

        // --- Place mower on left side (row 1 inside border, col 1 inside border) ---
        Mower mower = new Mower(1, 1, 1); // facing right

        mower.randomize(yard);
        // Animation loop
        while (true) {

    clearScreen();
    yard.printYard(mower);
    delay(200);

    if (!mower.updateMower(yard)) {
        break;
    }
}
        System.out.println("\nMowing complete!");
        scanner.close();
    }
}



