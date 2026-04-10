// I used ChatGPT to help me create a simple test program to show how the toString() and equals() methods work with different BaseballCard objects.

public class Demo {
    public static void main(String[] args) {

        BaseballCard card1 = new BaseballCard("Babe Ruth", 1927);
        BaseballCard card2 = new BaseballCard("Babe Ruth", 1927);
        BaseballCard card3 = new BaseballCard("Mickey Mantle", 1952);

        // Demonstrate toString()
        System.out.println("Displaying cards:");
        System.out.println(card1);
        System.out.println(card3);

        // Demonstrate equals()
        System.out.println("\nComparing cards:");
        System.out.println("card1 equals card2: " + card1.equals(card2)); // true
        System.out.println("card1 equals card3: " + card1.equals(card3)); // false
    }
}
    

