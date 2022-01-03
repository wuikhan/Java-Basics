package basics;

import java.util.Scanner;

public class Day26_Exceptions {

	public static void main(String[] args) {
		try {
			Scanner a = new Scanner(System.in);
			System.out.println("Enter the first number : ");
			int firstnumber = a.nextInt();

			System.out.println("Enter the second number : ");
			int secondnumber = a.nextInt();

			int result = firstnumber / secondnumber;
			System.out.println("The result is " + result);

			String[] names = new String[3];
			names[0] = "john";
			names[1] = "mike";
			names[2] = "peter";
			System.out.println(names[2]);
			
//			String country = null;
//			System.out.println(country.length()); // null pointer
			
		} catch (ArithmeticException e) {
			System.out.println("The user divided by 0");
		}   catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Printing a value which does not exist in the array");
		} catch (Exception e) {
			System.out.println("some msg");
		} finally {
			System.out.println("This line is from the finally block");
		}
		
		System.out.println("This code is working");
		System.out.println("This code is working");
		System.out.println("This code is working");
	}
}
