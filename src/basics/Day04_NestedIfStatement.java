package basics;

public class Day04_NestedIfStatement {

	public static void main(String[] args) {
		
		// if user age is less than 18 , print you are too young to work
		// if it is greater than 18, print you are eligible to work
		// if the person is less than 64, you not ready to retire
		// if the person is over 64 , you are ready to retire.
		
		int age = 15;
		
		if(age < 18) {
			System.out.println("You are too young to work");
		} else {
			System.out.println("You are eligible to work");
			
			if(age < 64) {
				System.out.println("You are not ready to retire");
			} else {
				System.out.println("You are ready to retire");
			}
		}
		
		
		// if the user income is 30000 and their credit score is poor print you are not approved
		// if the user income is 30000 and their credit score is good print you are approved for $5000
		// if the user income is 30000 and their credit score is excellent print you are approved for $10000
		
		int income = 40000;
		String creditScore = "excellent";
		
		if(income >= 30000) {
			if(creditScore == "poor") {
				System.out.println("You are not approved.");
			} else if (creditScore == "good") {
				System.out.println("You are approved for $5000.");
			} else {
				System.out.println("You are approved for $10,000.");
			}
		} else {
			System.out.println("Your income is too low.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}