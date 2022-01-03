package basics;

public class Day11_Methods {

	public static void main(String[] args) {
		sample();
		add(2, 10);
		add(200, 300);
		add(500, 200);
		todayIs("Wednessday", 17);
		todayIs("Thursday", 18);
	}
	
	// this is an example of user defined method without any argument/parameter
	// this method does not have any parameter and it does not return any value.
	public static void sample() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	// this is an example of user defined method with parameter
	// this method accepts 2 parameters and it does not return any value
	public static void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
	
	public static void todayIs(String day, int date) {
		System.out.println("Today is "+day + " the date today is "+date);
	}
}


// create a method which is going to add 4 values
// create a method which is going to subtract 2 values