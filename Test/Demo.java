import org.derryfield.math.Algebra;

public class Demo {
    public static void main(String[] args){
        double x = 2;
        double y = 4;
        double result = Algebra.harmonicMean(x,y);
        System.out.println("Harmonic Mean:" + result);
    }
}