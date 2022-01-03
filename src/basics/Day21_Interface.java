package basics;

interface interfaceExample {
	// only have abstract methods which means they are only declared
	public abstract void exampleOne();
	public void exampleTwo();
	
	static int a = 10;
}

public class Day21_Interface implements interfaceExample {

	public static void main(String[] args) {
		interfaceExample obj = new Day21_Interface();
		obj.exampleOne();
		obj.exampleTwo();
		
		System.out.println(a);
		
		Day21_Interface a = new Day21_Interface();
		a.exampleOne();
		a.exampleTwo();
	}


	public void exampleOne() {
		System.out.println("this is example one");
	}

	
	public void exampleTwo() {
		System.out.println("this is example two");
	}

}
