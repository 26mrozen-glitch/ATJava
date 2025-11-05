import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter a phrase: ");
       String phrase = input.nextLine();

       int count = 0;

       // loop through each character in the phrase
       for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == 'e') {
                count++;
            }
        }
        System.out.println("The letter 'e' occurred " + count + " times.");

        input.close();
    }
}