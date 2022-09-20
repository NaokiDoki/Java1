//Printing Bio data with userinput data

import java.util.*;
class bio2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		System.out.print("Enter your Gender: ");
		String Gender = scan.nextLine();
		System.out.print("Enter your DOB: ");
		String DOB = scan.nextLine();
		
		System.out.println("\nName: " + name);
		System.out.println("Gender: "+ Gender);
		System.out.println("DOB: "+ DOB); 
		}
	}
