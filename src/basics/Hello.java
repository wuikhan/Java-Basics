package basics;

public class Hello {
	
	int y;
	int z;

	Hello(int a, int b) {
		y = a;
		z = b;
		System.out.println("The value of y is " + y);
		System.out.println("The value of z is " + z);
	}
	
	public static void methodTwo() {
		System.out.println("This is method two");
	}
	
	
	Hello(){
		System.out.println("This is a hello constructor");
	}
	
	Hello(int a){
		System.out.println("This is a parameterized constructor "+a);
	}
	
	Hello(String a){
		System.out.println("This is a parameterized constructor "+a);
	}
	
	public static void methodOne() {
		System.out.println("This is a user defined method");
	}

}
