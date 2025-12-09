import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = in.nextInt();

        if (n <= 1) {
            System.out.println(n + " is not prime.");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is prime.");
        } else {
            System.out.println(n + " is not prime.");
        }
    }
}
