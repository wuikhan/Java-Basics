package basics;

import java.util.Scanner;

public class Day26_Exceptions2 {

	public static void main(String[] args) {
		try {
			Scanner a = new Scanner(System.in);
			System.out.println("Enter the first number : ");
			float firstnumber = a.nextInt();

			System.out.println("Enter the second number : ");
			float secondnumber = a.nextInt();

			float result = firstnumber / secondnumber;
			System.out.println("The result is " + result);

			
		} catch (ArithmeticException e) {
			System.out.println("The user divided by 0");
		}  
		
		
	}
}
