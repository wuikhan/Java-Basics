package basics;

public class Day03_IfElseStatements {

	public static void main(String[] args) {
		// we need to write a program which is going to print the kind of a phone you have.
		// apple, samsung, google, nokia, huwawei
		
		String myPhone = "apple";
		
		if(myPhone == "apple") {
			System.out.println("You have an iphone."+myPhone);
		} else if(myPhone == "samsung") {
			System.out.println("You have s20"+myPhone);
		} else if(myPhone == "google") {
			System.out.println("You have google phone"+myPhone);
		} else if(myPhone == "nokia") {
			System.out.println("You have nokia phone"+myPhone);
		} else if(myPhone == "huwawei") {
			System.out.println("You have huwawei"+myPhone);
		} else {
			System.out.println("Your phone is not in the system"+myPhone);
		}
		

	}

}
