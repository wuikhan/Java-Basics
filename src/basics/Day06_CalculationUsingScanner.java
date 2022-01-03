package basics;

import java.util.Scanner;

public class Day06_CalculationUsingScanner {
	
	// main ctrl + space + enter
	// inside the class you will only have one main method
	public static void main(String[] args) {
		
		// calculation using scanner
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the first value : ");
		int valueOne = value.nextInt();
		
		System.out.println("Enter the second value : ");
		int valueTwo = value.nextInt();
		
		int sum = valueOne+valueTwo;
		System.out.println("Your sum is : "+sum);
		
		// create a program which is going to subtract 2 values
		
	}
}
