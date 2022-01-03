package basics;

import java.util.Scanner;

public class Day05_Scanner {

	public static void main(String[] args) {
		// Scanner : scanner class is used to take input from the user
		// In the class we have different methods
		// In the Scanner class we have different methods to take user input.
		
		// any time you need to access methods you have to create an object of the class
		// how to create an object of the class
		// class-name object-name = new class-name();
		
		Scanner getInput = new Scanner(System.in);
		// how to check available methods present in the scanner class
		// object-name.methodname
		System.out.println("Enter your name ? ");
		String name = getInput.nextLine(); // String
		System.out.println("Your name is : "+name);
		
		System.out.println("What is your age ? ");
		int age = getInput.nextInt(); // int
		System.out.println("Your age is : "+age);
		
		System.out.println("Are you currently enrolled ? type true for Yes and false for No");
		boolean currentlyEnrolled = getInput.nextBoolean();
		System.out.println("Your enrollment status is : "+currentlyEnrolled);
		
		
		
//		System.out.println("Enter your name : ");
//		String name = "Waqas";
//		int age = 20;
//		boolean currentlyEnrolled = true;
//		System.out.println("Your name is : "+name);

	}

}
