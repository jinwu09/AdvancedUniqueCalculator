package Method_Collection;

public class Methods {
    public static double Factorial(double a) {
        double fact = 1;
        for (int i = 1; i < a; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
