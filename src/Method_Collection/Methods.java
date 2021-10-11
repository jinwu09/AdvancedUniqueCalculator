package Method_Collection;

public class Methods {
    public static double Factorial(double n) {
        if (n == 0) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }


}
