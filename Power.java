import java.util.Scanner;
public class Power{
	public static void main(String args [])
{
	Scanner input= new Scanner(System.in);


        
	

	System.out.println(" Enter value of a number  for a: ");
        double a = input.nextDouble();

System.out.println(" Enter value of a number  : ");
        double b = input.nextDouble();

System.out.println(" Enter value of a number : ");
        double c = input.nextDouble();
double d = Math.pow(b,c);
double  e =  Math.pow(a, d) ;



System.out.println("The function is : " + e);
	}

}