package basics;

public class Day02_Task {

	public static void main(String[] args) {
		// Write a Java program to print an int, double and char.
		int a = 50000;
		System.out.println("The value of int a is "+a);
		
		double b = 12.8345384753945072749823492734f;
		System.out.println("This will give us 15 digits after the decimal : "+b);
		
		char c = '$';
		System.out.println("This is char data type and it will print a : "+c);
		
		// Write a program to add an integer variable having value 5 and a double variable having value 6.2.
		int valueOne = 5;
		double valueTwo = 6.2f;
		System.out.println("The sum of valueOne and valueTwo is : "+(valueOne+valueTwo));
		
		// Write a program to find the square of the number 3.9.
		float d = 3.9f;
		System.out.println(d * d);

		// Write a program to print the area of a rectangle of sides 2 and 3.
		
		int length = 2;
		int width = 3;
		int Area = length * width;
		System.out.println("The area is " +Area);
	}
}
