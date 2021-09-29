/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Factorial {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        int NumeratorF = 1;
        int DenominatorF1 = 1;
        int DenominatorF2 = 1;


    System.out.print("Please enter the Numerator: ");
    int Numerator = scanner.nextInt();

    for(int i = 1; i <= Numerator; i++) {
    NumeratorF = NumeratorF * i;
    }

        System.out.print("Please enter the First Denominator: ");
        int Denominator1 = scanner.nextInt();
        for(int i = 1; i <= Denominator1; i++){
        DenominatorF1 = DenominatorF1 * i;
        }

        System.out.print("Please enter the Second Denominator: ");
        int Denominator2 = scanner.nextInt();
        for(int i = 1; i <= Denominator2; i++){
        DenominatorF2 = DenominatorF2 * i;
        }

        int factorial = NumeratorF/(DenominatorF1 * DenominatorF2);
        System.out.println();
        System.out.println(Numerator + "!" + " is " + NumeratorF);
        System.out.println(Denominator1 + "!" + " is " + DenominatorF1);
        System.out.println(Denominator2 + "!" + " is " + DenominatorF2);
        System.out.println();

        System.out.println("The Final answer in " + Numerator + "!/" + Denominator1 + "!" + Denominator2 + "! is: " + factorial);
    
    }

} 
