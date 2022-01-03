package basics;

import java.util.Scanner;

public class Day26_ThrowThrows {

	public static void main(String[] args) {
		
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter your age : ");
		
		int age = a.nextInt();
		
		if(age<0) {
			throw new ArithmeticException("Age cannot be below 0.");
		}
		
		System.out.println("Your age is "+age);
	

	}

}
