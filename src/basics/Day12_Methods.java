package basics;

public class Day12_Methods {

	public static void main(String[] args) {
		// methodOne();
		// methodTwo(30, 20);
		// int d = methodThree(); // 40
		// System.out.println(d);
		// System.out.println(methodFour());

		// char z = methodFive();
		// System.out.println(z);

		// System.out.println(methodSix());

		//int y = methodSeven(50, 90);
		//System.out.println(y);

		//int x = methodSeven(40, 10);
		//System.out.println(x);
		
		System.out.println(methodEight("Waqas","Khan"));
	}
	
	public static String methodEight(String name, String lastName) {
		String myName = "My first name is : "+name+" and my last name is "+lastName;
		return myName;
	}
	
	// add a method with return type and with parameters
	public static int methodSeven(int a, int b) {
		return a + b;
	}

	// create a method which is going to return a character and the method does not
	// have any parameter
	public static char methodFive() {
		char a = 'c';
		return a;
	}

	public static boolean methodSix() {
		boolean a = true;
		return a;
	}

	// method which returns a value and does not have any parameter
	public static int methodThree() {
		String insideMethod = methodFour();
		System.out.println("This value is printed from method Three : " + insideMethod);
		int a = 20;
		int b = 20;
		int c = a + b;
		// System.out.println(c);
		return c;
	}

	public static String methodFour() {
		String day = "Thursday";
		return day;
	}

	// method which does not return a value and which does not have any parameter
	public static void methodOne() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}

	// method which does not return a value and which accepts a parameter
	public static void methodTwo(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
}