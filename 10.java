//Entering marks of any 5 subjects and printing percentage and division

import java.util.*;

class marks{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks in respective subjects" );
		System.out.print("English: ");
		int sub1 = scan.nextInt();
		System.out.print("Maths: ");
		int sub2 = scan.nextInt();
		System.out.print("Science: ");
		int sub3 = scan.nextInt();
		System.out.print("Nepali: ");
		int sub4 = scan.nextInt();
		System.out.print("Social: ");
		int sub5 = scan.nextInt();

		if(sub1<35 || sub2<35 || sub3<35 || sub4<35 || sub5<35){
			System.out.print("\nFAIL");
		}
		else{
			double percentage = (sub1+ sub2+ sub3+ sub4+ sub5) / 5;
			System.out.println("\nPercentage: " +percentage+ "%");
			if(percentage>=80){
				System.out.print("Division: Distinction");
			}
			else if(percentage>=70){
				System.out.print("Division: 1st");
			}
			else if(percentage>=60){
				System.out.print("Division: 2nd");
			}
			else{
				System.out.print("Division: 3rd");
			}

		}
	}
}
