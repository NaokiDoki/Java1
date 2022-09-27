//calculation simple interest 

import java.util.*;
class SI{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter principle: ");
		double p = scan.nextDouble();
		System.out.println("Enter Time: ");
		double t = scan.nextDouble();
		System.out.println("Enter Rate: ");
		double r = scan.nextDouble();
		
		double SI = (p*t*r)/100;
		System.out.println("The simple interest is "+SI);
		}
	}
