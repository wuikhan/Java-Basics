package basics;

import java.util.Scanner;

public class Day05_Scanner_Example2 {

	public static void main(String[] args) {
	/*
	 * we need to take user input, we can take input with the help of Scanner class
	 * Scanner class has different methods for different inputs for example
	 * if you wana take int value as an input you will use nextInt() method
	 * if you wana take String value as an input you will use nextLine() or next() method
	 * if you wana take boolean value as an input you will use nextBoolean() method
	 * 
	 * In order to access these methods we need to create an object of the Scanner class
	 */
		
		Scanner b = new Scanner(System.in);
		System.out.println("What day is today ?");
		String dayOfMonth = b.next(); // String
		System.out.println("today is : "+dayOfMonth);
		
		System.out.println("What year is it ?");
		int year = b.nextInt();
		System.out.println("The year is : "+year);
		
	}

}
