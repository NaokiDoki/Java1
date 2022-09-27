//performing maths operations using switch case

import java.util.*;
public class operations{

	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter two numbers:");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		System.out.print("Choose (+,-,*,/) to perform respective operation:");
		String str = scan.next();
		char c =str.charAt(0);

		switch(c){
			case '+':
			double sum = a+b;
			System.out.println("Sum = "+sum);
			break;

			case '-':
			double sub = a-b;
			System.out.println("Difference = "+sub);
			break;

			case '*':
			double multi = a*b;
			System.out.println("Multiplication = "+multi);
			break;

			case '/':
			double div = a/b;
			System.out.println("Division= "+div);
			break;

			default:
			System.out.println("Invalid choice!!");
			break;

		}

	}

}
