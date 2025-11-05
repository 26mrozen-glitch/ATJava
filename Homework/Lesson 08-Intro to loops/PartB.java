import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the APR as a percentage:");
        double apr = scanner.nextDouble() / 100.0;

        System.out.print ("Enter the balance:");
        double balance = scanner.nextDouble();

        System.out.println("Year|       Int Earned ($)     |       Balance ($)");
        System.out.println("-----------------------------------------------------");

        for (int year =1; year <=5; year++) {
            double interestEarned = balance * apr;
            balance += interestEarned;

            System.out.printf("%3d | %24.2f | %16.2f\n", year, interestEarned, balance);
        }
      
    }


}
