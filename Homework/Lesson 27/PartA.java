// Package: java.time
// Parent package: java

import java.time.LocalDate;
import java.time.LocalTime;

public class PartA {
    public static void main(String[] args) {

        // get current date
        LocalDate today = LocalDate.now();

        // get current time
        LocalTime time = LocalTime.now();

        System.out.println("Today's date is " + today);
        System.out.println("The time is " + time);
    }
}