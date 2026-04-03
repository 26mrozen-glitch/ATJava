package org.derryfield.math;

public class Algebra {
   
    // static method to calculate harmonic mean
    public static double harmonicMean(double x, double y) {
        if (x<=0 || y<=0 || (x+y)==0) {
            throw new IllegalArgumentException("values must be positive and sum cannot be zero");
        }
        return (2*x*y)/(x+y);
    }
    
}
