package basics;

public class Day11_Dog {
	// if i write below this line they will be called global
	// declare variables/state/properties/entities
	String breed;
	String size;
	String color;
	int age;

	public static void main(String[] args) {
		// if i write variable inside main method they will be called locally

		// in order to save information for different objects we need to create
		// different objects
		// how do you create an object ? classname objectname = new classname();
		
		Day11_Dog dog1obj = new Day11_Dog();
		dog1obj.breed = "Neapolitan Mastiff";
		dog1obj.size = "Large";
		dog1obj.age = 5;
		dog1obj.color = "black";

		System.out.println(dog1obj.breed);
		System.out.println(dog1obj.size);
		System.out.println(dog1obj.age);
		System.out.println(dog1obj.color);

		Day11_Dog dog2obj = new Day11_Dog();
		dog2obj.breed = "Maltese";
		dog2obj.size = "Small";
		dog2obj.age = 2;
		dog2obj.color = "White";

		System.out.println(dog2obj.breed);
		System.out.println(dog2obj.size);
		System.out.println(dog2obj.age);
		System.out.println(dog2obj.color);

	}

}
