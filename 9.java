//smallest number among 3 user input numbers

import java.util.*;

class smallest{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if(a<b && a<c){				
		System.out.print(+a+ " is the smallest.");
		}
		else if(b<a && b<c){
		System.out.print(+b+ " is the smallest.");
		}
		else{
		System.out.print(+c+ " is the smallest.");
		}
	}
}
