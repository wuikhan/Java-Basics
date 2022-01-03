package packageOne;

import packageTwo.Day13DefaultMethod;

public class Day13_DefaultAccessModifier {

	public static void main(String[] args) {
	
		Day13DefaultMethod a = new Day13DefaultMethod();
		a.helloOne();
		
		Day13_DefaultAccessModifier aa = new Day13_DefaultAccessModifier();
		aa.helloTwo();
		
		
		Day13_DefaultAccessModifier_2 a2 = new Day13_DefaultAccessModifier_2();
		a2.helloThree();
		
	}
	
	// default method
	static void helloTwo() {
		System.out.println("This is a default method within the class");
	}
	
}
