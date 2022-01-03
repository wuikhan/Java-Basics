package packageOne;

public class ClassOne {
	
	static int methoTwo(int num) {
		return num;
	}
	
	public int methodSix(int num) {
		return num;
	}
	
	private static void methodNine() {
		System.out.println("This is an example of within the package. This should be accessible.");
	}
	
	protected static void methodTweleve() {
		System.out.println("This is an example of within the package. This should be accessible");
	}

}
