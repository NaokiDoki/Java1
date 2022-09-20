// SUm of any two user input numbers

import java.util.*;
class sum{
	public static void main(String[] args){
		Scanner sum = new Scanner(System.in);
		System.out.println("Enter any two numbers: ");
		int a = sum.nextInt();
		int b = sum.nextInt();
		
		int sum = a + b;
		System.out.println("The sum is "+sum);
		}
	}
