package basics;

public class Day15_StaticVariable {

	static int a = 10;

	public static void main(String[] args) {
		System.out.println(a);
		methodOne();
		
		Day15_StaticVariable aa = new Day15_StaticVariable();
		aa.methodTwo();
		
		a = 20; // it will update the value of a
		System.out.println(a);
		
		a = 30; // it will update the value of a
		System.out.println(a);
	}

	// static method
	public static void methodOne() {
		System.out.println("Hello World.");
	}
	
	// non-static method
	public void methodTwo() {
		System.out.println("method two");
	}
}
