public class PartB {
    public static void main(String[] args) {
        double a = 5.0;
        double b = 6.7;
        double c = 8.9;

        double result = smallest(a, b, c);
        System.out.println("The smallest of " + a + ", " + b + ", and " + c + " is " + result);
    }
   public static double smallest(double a, double b, double c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    } 
}
