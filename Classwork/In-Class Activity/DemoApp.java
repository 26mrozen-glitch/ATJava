import mystuff.Random;

public class DemoApp {

    public static void main(String[] args) {

        System.out.println("Here are 5 randomly generated numbers from 1 to 100:");

        for (int i = 0; i < 5; i++) {
            int number = Random.getRandomInteger(100);
            System.out.println("  " + number);
        }

        System.out.println("Goodbye!");
    }
} 
