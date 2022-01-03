package basics;

public class Day03_Operators {

	public static void main(String[] args) {
		// Operators
		int a = 2;
		int b = 3;
		System.out.println(a == b); // false
		System.out.println(a != b); // true
		System.out.println(a > b); // false
		System.out.println(a >= b); // false
		System.out.println(a < b); // true
		System.out.println(a <= b); // true
		
		if(a < b) {
			// the code inside will get executed
			System.out.println("The value of a is less than the value of b");
		} else {
			System.out.println("The value of a is greater than the value of b");
		}
		//Compare 2 double values using if else statement.
		double c = 145.8234823468237468273468234f;
		double d = 55.763475638465834658374583764f;
		
		if(c > d) {
			System.out.println("The value of c is greater than d");
		} else {
			System.out.println("The value of c is less than d");
		}
		
		// Check if the number is positive or negative using if else statement.
		
		int e = -5;
		
		if(e < 0) {
			System.out.println("The value is negative");
		} else {
			System.out.println("The value is positive");
		}
		
		
	}
}
