package basics;

import java.util.Scanner;

public class Day24_Task {

	public static void main(String[] args) {
		//findCenterValue();
		
		boolean returnedValue = compare2Values();
		System.out.println(returnedValue);
	}
	
//	Create a method that will take 2 parameters as a String(actualValue, expectedValue). 
//	Your method should return boolean value verifying whether given two strings are equal or not 
	public static boolean compare2Values() {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the first text : ");
		String text1 = a.next();
		System.out.println("Enter the second text : ");
		String text2 = a.next();

		
		return text1.equalsIgnoreCase(text2);
	}
	
	public static void findCenterValue() {
//		Create a method that will take 1 parameter as a String. If 
//		the String has odd number of characters and has 3 or more characters, print the character in the middle of the String.
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the text : ");
		
		String userInput = a.next(); // today we are going to learn more strings
		int userInputLength = userInput.length();
		
		int startingValue=0;
		int endingValue =0;
		
		if(userInputLength ==3) {
			startingValue = userInputLength/2; //3
			endingValue = startingValue+1;
		} else if (userInputLength>= 5){
			startingValue = (userInputLength/2)-1;
			endingValue = startingValue + 2;
		}
		
		System.out.println("The character in the middle is "+userInput.substring(startingValue, endingValue));
	
	}
}
