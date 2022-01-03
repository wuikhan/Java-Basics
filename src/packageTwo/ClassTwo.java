package packageTwo;

// sub class
class ClassThree {
	
	 static void methodThree() {
		System.out.println("This is an example of sub class outside the package, it will not be accessible.");
	}
	
}

// main class
public class ClassTwo {
	
	static void methodFour() {
		System.out.println("This is an example of outside the package. This method is not accessible");
	}
	
	public static void methodSeven() {
		System.out.println("This is an example of outside the package. This should be accessible.");
	}
	
	private static void methodTen() {
		System.out.println("This is an example of outside the package. This should not be accessible.");
	}
	
	protected static void methodThirteen() {
		System.out.println("This is an example of outside the package . This should not be accessible.");
	}

}
