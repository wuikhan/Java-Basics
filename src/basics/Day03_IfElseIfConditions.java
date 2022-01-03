package basics;

public class Day03_IfElseIfConditions {

	public static void main(String[] args) {
		// if the value of x is 1 , you print the value is 1
		// if the values of x is 2, you print the value is 2
		// if the value of x is 3 , you print the value is 3
		// if the values of x is 4, you print the value is 4
		// if the value of x is 5 , you print the value is 5
		// if the values of x is 6, you print the value is 6
		// if none of the value matches print the value is something else

		int x = 100;
		
		if (x == 1) {
			System.out.println("The value is " + x);
		} else if (x == 2) {
			System.out.println("The value is " + x);
		} else if (x == 3) {
			System.out.println("The value is " + x);
		} else if (x == 4) {
			System.out.println("The value is " + x);
		} else if (x == 5) {
			System.out.println("The value is " + x);
		} else if (x == 6) {
			System.out.println("The value is " + x);
		} else {
			System.out.println("The value is something else, the value of x is :" + x);
		}
	}

}
