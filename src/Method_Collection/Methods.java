package Method_Collection;

public class Methods {
    public static double Factorial(double n) {
        if (n == 0) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }
    public static double SigmaXPlusY(double a,double b, double y) {
        double sum = 0;
        while (a <= b) {
            sum = sum + (a + y);
            a++;
        }
        return sum;
    }
    public static double NestedSigmaXPlusY(double a1,double b1,double c1,double d1){
        double sum = 0;
        for (double a = a1; a <= b1; a++) {
            for (double c = c1; c <= d1; c++) {
                sum = sum + (a + c);
            }
        }
        return sum;
    }
    public static double SigmaXY(double a,double b, double y){
        double sum = 0;
        while (a <= b) {
            sum = sum + (a * y);
            a++;
        }
        return sum;
    }
    public static double NestedSigmaXY(double a1,double b1,double c1,double d1){
        double sum = 0;
        for (double a = a1; a <= b1; a++) {
            for (double c = c1; c <= d1; c++) {
                sum = sum + (a * c);
            }
        }
        return sum;
    }
    public static double SigmaXRaiseY(double a,double b, double y){
        double sum = 0;
        while (a <= b) {
            sum = sum + (Math.pow(a,y));
            a++;
        }
        return sum;
    }
    public static double SigmaYRaiseX(double a,double b, double y){
        double sum = 0;
        while (a <= b) {
            sum = sum + (Math.pow(y,a));
            a++;
        }
        return sum;
    }
    public static double NestedSigmaXRaiseY(double a1,double b1,double c1,double d1){
        double sum = 0;
        for (double a = a1; a <= b1; a++) {
            for (double c = c1; c <= d1; c++) {
                sum = sum + (Math.pow(a,c));
            }
        }
        return sum;
    }
    public static double PiXPlusY(double a,double b, double y){
        double prod = 1;
        while (a <= b) {
            prod = prod * (a+y);
            a++;
        }
        return prod;
    }
    public static double NestedPiXPlusY(double a1,double b1,double c1,double d1){
        double sum = 1;
        for (double a = a1; a <= b1; a++) {
            for (double c = c1; c <= d1; c++) {
                sum = sum * (a+c);
            }
        }
        return sum;
    }
    public static double PiXY(double a,double b, double y){
        double prod = 1;
        while (a <= b) {
            prod = prod * (a*y);
            a++;
        }
        return prod;
    }
    public static double NestedPiXY(double a1,double b1,double c1,double d1){
        double sum = 1;
        for (double a = a1; a <= b1; a++) {
            for (double c = c1; c <= d1; c++) {
                sum = sum * (a*c);
            }
        }
        return sum;
    }
    public static double PiXRaiseY(double a,double b, double y){
        double prod = 1;
        while (a <= b) {
            prod = prod * (Math.pow(a,y));
            a++;
        }
        return prod;
    }
    public static double NestedPiXRaiseY(double a1,double b1,double c1,double d1){
        double sum = 1;
        for (double a = a1; a <= b1; a++) {
            for (double c = c1; c <= d1; c++) {
                sum = sum * (Math.pow(a,c));
            }
        }
        return sum;
    }
    public static double Perm(double n,double r){
        double  d, fact = 1, factd = 1, result = 0;

        d = n - r;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        for (int j = 1; j <= d; j++) {
            factd *= j;
        }
        result = fact / factd;
        return result;
    }
    public static double Combination(double n, double r){
        return Factorial(n)/(Factorial(r)*Factorial(n-r));
    }
}
