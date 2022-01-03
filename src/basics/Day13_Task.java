package basics;

import java.util.Scanner;

public class Day13_Task {

	protected static void main(String[] args) {
		// scanner
		// loop
		// array

		// first ask a question , how many values
		// user should be able to enter a int value e.g scanner
		// you need to initialize an array
		// run the loop ^ many times to accept the values and print the sum

		System.out.println("How many values do you need a sum for ? ");
		Scanner getInput = new Scanner(System.in);
		int noOfValues = getInput.nextInt(); // 3
		
		// if i need to initialize an array of size 3
		int[] num = new int[noOfValues];
		
		int sum = 0;
		
		
		for(int i=0; i < num.length; i++) {
			System.out.println("Enter the "+i+" value : ");
			num[i] = getInput.nextInt();
			sum = sum + num[i];
		}
		System.out.println("The sum is : "+sum);
	}
}
