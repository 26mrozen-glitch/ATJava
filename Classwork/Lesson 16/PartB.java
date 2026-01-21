// I got a little bit of help from chatgpt with the math and just the format of the average calcuation.

import java.util.Arrays;

public class PartB {

    public static void main(String[] args) {

        // Test case 1
        System.out.println("Average(10, 8, 9) = " + average(10, 8, 9));

        // Test case 2
        double[] scores = {100, 90, 80, 100, 80};
        System.out.println("Average(scores) = " + average(scores));
    }

    public static double average(double... values) {
        if (values.length == 0) {
            return 0;
        }

        double sum = 0;
        for (double v : values) {
            sum += v;
        }

        return sum / values.length;
    }
}