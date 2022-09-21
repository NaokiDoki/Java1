// finding the roots of Quadratic equation.


import java.util.*;

class quadratic{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("In equation X= -b+√b2-4ac/2a, enter value of a,b,c: ");
		System.out.print("Enter a: ");
		double a = scan.nextInt();
		System.out.print("Enter b: ");
		double b = scan.nextInt();
		System.out.print("Enter c: ");
		double c = scan.nextInt();
	
		double rt1 = ((-b)+(Math.sqrt(b)-4*a*c))/(2*a);
		double rt2 = ((-b)-(Math.sqrt(b)-4*a*c))/(2*a);
		System.out.print("The Quadratic roots are " +rt1+ "and " + rt2 );
	}
}
		
