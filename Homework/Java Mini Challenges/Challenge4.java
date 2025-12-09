import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a value from 0 to 20: ");
        int value = in.nextInt();

        // Keep value in range
        if (value < 0) {
            value = 0;
        } else if (value > 20) {
            value = 20;
        }

        System.out.print("progress:[");
        
        // Print the #s
        for (int i = 0; i < value; i++) {
            System.out.print("#");
        }

        // Print the -s
        for (int i = value; i < 20; i++) {
            System.out.print("-");
        }

        System.out.print("]");

        int percent = (int)((value / 20.0) * 100);
        System.out.println(" " + percent + "%");
    }
}