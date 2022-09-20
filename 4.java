//calculation simple interest 

import java.util.*;
class SI{
	public static void main(String[] args){
		Scanner aditi = new Scanner(System.in);
		System.out.println("Enter principle: ");
		double p = aditi.nextInt();
		System.out.println("Enter Time: ");
		double t = aditi.nextInt();
		System.out.println("Enter Rate: ");
		double r = aditi.nextInt();
		
		double SI = (p*t*r)/100;
		System.out.println("The simple interest is "+SI);
		}
	}
