// SUm of any two user input numbers

import java.util.Scanner;
class sum{
	public static void main(String[] args){
		Scanner aditi = new Scanner(System.in);
		System.out.println("Enter any two numbers: ");
		int a = aditi.nextInt();
		int b = aditi.nextInt();
		
		int sum = a + b;
		System.out.println("The sum is "+sum);
		}
	}
