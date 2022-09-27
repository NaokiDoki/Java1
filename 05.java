//calculation Compound interest 

import java.util.*;
class CI{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter principle: ");
		double p = scan.nextDouble();
		System.out.println("Enter Time: ");
		double t = scan.nextDouble();
		System.out.println("Enter Rate: ");
		double r = scan.nextDouble();
		
		double CI = p*Math.pow(1+r/100,t);
		System.out.println("The Compound interest is "+CI);
	}
}
