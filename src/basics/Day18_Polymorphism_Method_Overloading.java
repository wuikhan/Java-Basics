package basics;

public class Day18_Polymorphism_Method_Overloading {
	
	public void addition(int a, int b) {
		System.out.println("This the sum of 2 values : "+(a+b));
	}
	
	
	public void addition(float a, int b) {
		System.out.println("This the sum of 1 floating value and 1 int value : "+(a+b));
	}
	
	public void addition(String a, String b) {
		System.out.println(a + b);
	}
	
	public void addition(int a, int b, int c) {
		System.out.println("This the sum of 3 values : "+(a+b+c));
	}
	
	public void addition(String a, String b, String c) {
		System.out.println(a+b+c);
	}
	
	public void addition(boolean a, String b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		
		Day18_Polymorphism_Method_Overloading a = new Day18_Polymorphism_Method_Overloading();
		a.addition(20,40);
		a.addition(10.7364647373633f, 50);
		a.addition(20, 20, 30);
		a.addition("Hello ", "Today, we are learning ", "Polymorphism");
		a.addition("Method ", "Overloading Example");
		a.addition(true, "hello", 100);
	}
}
