package packageOne;

import packageTwo.ClassTwo;

public class ClassMain {

	public static void main(String[] args) {

		ClassMain s1 = new ClassMain();
		s1.methodOne();

		ClassOne s2 = new ClassOne();
		int returnedValue = s2.methoTwo(20);
		System.out.println(returnedValue);

		// we cannot create an object of the below class because it is a sub-class
//		ClassThree s3 = new ClassThree();
//		s3.methodThree();

		ClassTwo s4 = new ClassTwo();
		// we will not be able to call he below line because
		// it is a default method and it is present outside the package.
//		s4.methodFour();

		s1.methoFive();
		int returnedValue6 = s2.methodSix(30);
		System.out.println(returnedValue6);

		s4.methodSeven();

		s1.methodEight();

		// the below line will not be called because methodNine is private and it is
		// present within a package but in a different class
//		s2.methodNine();

// the below line will not be called because methodTen is private and it is
		// present outside the package
//		s4.methodTen();
		
		s1.methodEleven();
		
		s2.methodTweleve();
		
		// This below line will not be called because methodThirteen is protected
		// and it is present outside the package.
//		s4.methodThirteen();
	}

	// within the class and with default modifier the method will be accessible
	static void methodOne() {
		System.out.println("This is an example of within class / default modifier . it should be accessible");
	}

	public static void methoFive() {
		System.out.println("This is an example of within class / public modifier. It should be accessible");
	}

	private static void methodEight() {
		System.out.println("This is an example of within class / private modifier. This should be accessible.");
	}
	
	protected static void methodEleven() {
		System.out.println("This is an example of within class / protected modifier. This should be accessible.");
	}

}
