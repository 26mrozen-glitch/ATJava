// After completing my code the output kept saying that every input was not a palindrome. I used chat gpt to try and dissect the issue and it was as small as that I had a space between the quotation marks after String cleaned

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String text = in.nextLine();

        // Remove spaces and make lowercase
        String cleaned = "";
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            if (c != ' ') {
                cleaned += c;
            }
        }

        // Reverse using a loop
        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        // Check if palindrome
        if (cleaned.equals(reversed)) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }
    }
}
