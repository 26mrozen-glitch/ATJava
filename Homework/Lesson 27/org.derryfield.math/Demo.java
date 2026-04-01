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



