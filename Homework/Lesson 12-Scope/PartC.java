import java.util.Scanner;

public class PartC {

    public static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
    public static int countVowels(String phrase){
        int count = 0;

        for (int i = 0; i < phrase.length(); i++) {
            if (isVowel(phrase.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    
   public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = in.nextLine();  
        int vowelCount = countVowels(phrase);
        System.out.println("Number of vowels: " + vowelCount);
    }
}
