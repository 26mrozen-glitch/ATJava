// I used the internet and ChatGPT to help me understand how to call methods from another class and use the Scanner for input. Not sure why but my package keeps throwing an error.

package org.derryfield.math;

import java.util.Scanner;
import org.derryfield.math.Geometry;

public class Demo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        double side = input.nextDouble();

        double perimeter = Geometry.get_perimeter_square(side);
        double area = Geometry.get_area_square(side);

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);

        input.close();
    }
}



