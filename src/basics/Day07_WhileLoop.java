package basics;

public class Day07_WhileLoop {

	public static void main(String[] args) {
		/*
		 * in while loop the value of i is initialized outside the while loop
		 * which is the reason the value of i is accessible inside the while loop
		 * as well as outside the while loop.
		 * In for loop the value is initialized inside the for loop which is the reason
		 * it is not accessible outside the for loop
		 */
		
		
		int i=0; // initialization out side the loop
		
		while(i<10) { // condition
			System.out.println("using while loop "+i);
			i++;// increament
		}
		
		
		
		System.out.println("outside"+i);

	}

}
