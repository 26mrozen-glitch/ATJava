// I used ChatGPT to review how to structure the Counter class and how to properly use it in a main program. It helped me make sure I created separate counter objects, correctly incremented them based on user input, and displayed the final vote totals properly.

import java.util.Scanner;

class Counter {
    private int count = 0;
    
    public void increment() {
        count++;
    }
    
    public int getCount() {
        return count;
    }
}

public class PartB {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Create one counter per dessert
        Counter cakeCounter = new Counter();
        Counter pieCounter = new Counter();

        char choice;

        System.out.println("Vote for your favorite dessert!");
        System.out.println("Enter 'c' for cake");
        System.out.println("Enter 'p' for pie");
        System.out.println("Enter 'q' to quit");

        do {
            System.out.print("Your choice: ");
            choice = in.next().toLowerCase().charAt(0);

            if (choice == 'c') {
                cakeCounter.increment();
            } else if (choice == 'p') {
                pieCounter.increment();
            }

        } while (choice != 'q');

        // Display totals
        System.out.println("\nVoting Results:");
        System.out.println("Cake votes: " + cakeCounter.getCount());
        System.out.println("Pie votes: " + pieCounter.getCount());

        in.close();
    }
}