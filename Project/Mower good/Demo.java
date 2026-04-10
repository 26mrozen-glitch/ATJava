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

        // Animation loop
        while (true) {

            mower.cutGrass(yard);       // cut grass under mower
            yard.printYard(mower);      // print yard with mower
            delay(500);                 // wait half a second

            // Stop before hitting right wall (yard width + 1 because of border)
            if (mower.getCol() == yard.getLawnWidth()) {
                break;
            }

            mower.moveForward();        // move mower one cell forward
        }

        System.out.println("\nMowing complete!");
        scanner.close();
    }
}

