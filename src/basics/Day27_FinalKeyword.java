package basics;

final class finalKeyword {
	int a = 10;
	String name = "John";
}

class finalMethod {
	final static int b = 20;

	final public void methodOne() {
		System.out.println("This method is coming from final method class.");
	}
}

public class Day27_FinalKeyword extends finalMethod {

	/*
	 * this method will give us an error because we cannot perform method overriding
	 * because the method is set to final public void methodOne() {
	 * System.out.println("This method is coming from Day27_FinalKeyword."); }
	 */
	public static void main(String[] args) {
		// b = 30; we cannot reinitialize the value of b variable because it is final in
		// the parent class

		Day27_FinalKeyword obj1 = new Day27_FinalKeyword();
		obj1.methodOne();

		System.out.println("The value of b variable is : " + obj1.b);
//		finalKeyword obj = new finalKeyword();
//		System.out.println("Before re-initializing " + obj.a);
//		obj.a = 20;
//		System.out.println("After re-initializing " + obj.a);
//		System.out.println("Name "+obj.name);
	}
}