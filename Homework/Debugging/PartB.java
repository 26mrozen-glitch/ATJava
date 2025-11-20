// Myles
// The original code had a logic error. The order of the if-else statements needed to be switched so that the larger number is checked first.
// After struggling I had ChatGPT help me with identifying the error in the original code.

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of cookies:");
        int num = in.nextInt();
        double discount;
        if (num > 12) {
        discount = 0.10;
        } else if (num > 6) {
        discount = 0.05;
        } else {
        discount = 0.00;    
        }
        System.out.println("Discount is = " + discount);
        }    
}
