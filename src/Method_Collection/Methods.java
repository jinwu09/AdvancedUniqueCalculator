package Method_Collection;

public class Methods {
    public static double Factorial(double n) {
        if (n == 0) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }
    public  static int Sigma(int a, int b, String Equation){
        int prod = 0;
        if (Equation.indexOf("-") >= 0){

        }else if (Equation.indexOf("+") >= 0){

        }else if (Equation.indexOf("/") >= 0){

        }else{
            for (int c = b; c <= a; c++) {
                prod = prod + (c);
            }
        }

        return prod;
    }

}
