package basics;

class cars {
	public void type() {
		System.out.println("The type of the car is sedan");
	}

	public void model(String color) {
		System.out.println("What color is the car " + color);
	}
	
	public void openBrowser() {
		System.out.println("open firefox");
	}
}

class suv extends cars {
	public void type() {
		System.out.println("The type of the car is suv");
	}
	
	public void model(String color) {
		System.out.println("The color of the car is : " + color);
	}
	
	public void openBrowser() {
		System.out.println("open chrome");
	}

}

public class Day18_Polymorphism_Method_Overriding extends suv {
	public static void main(String[] args) {
		Day18_Polymorphism_Method_Overriding a = new Day18_Polymorphism_Method_Overriding();
		a.type();
		a.model("red");
		a.openBrowser();
	}
}
