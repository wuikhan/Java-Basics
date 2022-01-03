package basics;

class Furniture {

	Furniture() {
		System.out.println("This is 0 parameter constructor from furniture class");
	}

	Furniture(int a) {
		System.out.println("This is 0 parameter constructor from furniture class" + a);
	}
}

class chair extends Furniture {
	chair() {
		super(50);
		System.out.println("This is 0 parameter constructor from chair class");
	}
}

public class Day19_Super {

	public static void main(String[] args) {
		chair a = new chair();
	}
}
