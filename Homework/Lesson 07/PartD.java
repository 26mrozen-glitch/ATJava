import java.util.Scanner;
public class PartD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer (1-3999): ");
        int number = in.nextInt();

        if (number < 1 || number > 3999) {
            System.out.println("Enter a number between 1 and 3999.");
        } else {
            String[] thousands = {"", "M", "MM", "MMM"};
            String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
            String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

            String romanNumeral = thousands[number / 1000] +
                 hundreds[(number % 1000) / 100] +
                 tens[(number % 100) / 10] +
                 ones[number % 10];

            System.out.println("The Roman numeral is: " + romanNumeral);
        }
        in.close();
    }
}
