// I had ChatGPT assist with identifying the lowest value and looping through the ArrayList.
import java.util.ArrayList;
import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> temps = new ArrayList<>();

        while (true) {
            System.out.print("Enter a temperature (q to quit): ");
            String value = input.nextLine();

            if (value.equalsIgnoreCase("q")) {
                break;
            }

            temps.add(Integer.parseInt(value));
        }

        int lowest = temps.get(0);
        for (int temp : temps) {
            if (temp < lowest) {
                lowest = temp;
            }
        }

        System.out.println("Temperatures:");
        for (int temp : temps) {
            if (temp == lowest) {
                System.out.println(temp + " <= lowest");
            } else {
                System.out.println(temp);
            }
        }
    }
}