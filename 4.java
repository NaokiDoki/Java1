//calculation simple interest 

import java.util.Scanner;
class SI{
	public static void main(String[] args){
		Scanner aditi = new Scanner(System.in);
		System.out.println("Enter principle: ");
		float p = aditi.nextInt();
		System.out.println("Enter Time: ");
		float t = aditi.nextInt();
		System.out.println("Enter Rate: ");
		float r = aditi.nextInt();
		
		float SI = (p*t*r)/100;
		System.out.println("The simple interest is "+SI);
		}
	}
