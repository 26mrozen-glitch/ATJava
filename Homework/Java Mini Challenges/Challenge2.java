// I used chat gpt to help me with formatting the dice

import java.util.Random;

public class Challenge2 {

    public static void main(String[] args) {
        Random rand = new Random();
        int die1, die2;
        int rollCount = 0;

        do {
            rollCount++;
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;

            System.out.println("Roll " + rollCount + ": " + die1 + " + " + die2);

            // Print ASCII dice for this roll
            printDice(die1, die2);

            System.out.println();

        } while (die1 != die2);  // <-- STOP when numbers are equal

        System.out.println("You rolled a double! Program finished.");
    }

    // Return ASCII die as an array of 4 lines
    public static String[] getDieFace(int dieValue) {
        switch (dieValue) {
            case 1:
                return new String[]{
                        " _____ ",
                        "|     |",
                        "|  *  |",
                        "|_____|"
                };
            case 2:
                return new String[]{
                        " _____ ",
                        "|*    |",
                        "|     |",
                        "|____*|"
                };
            case 3:
                return new String[]{
                        " _____ ",
                        "|*    |",
                        "|  *  |",
                        "|____*|"
                };
            case 4:
                return new String[]{
                        " _____ ",
                        "|*   *|",
                        "|     |",
                        "|*___*|"
                };
            case 5:
                return new String[]{
                        " _____ ",
                        "|*   *|",
                        "|  *  |",
                        "|*___*|"
                };
            case 6:
                return new String[]{
                        " _____ ",
                        "|*   *|",
                        "|*   *|",
                        "|*___*|"
                };
            default:
                return new String[]{
                        " _____ ",
                        "|     |",
                        "|     |",
                        "|_____|"
                };
        }
    }

    // Print two dice side-by-side
    public static void printDice(int die1, int die2) {
        String[] face1 = getDieFace(die1);
        String[] face2 = getDieFace(die2);

        for (int i = 0; i < face1.length; i++) {
            System.out.println(face1[i] + "   " + face2[i]);
        }
    }
}