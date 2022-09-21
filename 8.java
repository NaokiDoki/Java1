//greatest number among to user input numbers

import java.util.*;

class greatest{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();

		if(a>b){				
		System.out.print(+a+ " is the greatest.");
		}
		else{
		System.out.print(+b+ " is the greatest.");
		}
	}
}
