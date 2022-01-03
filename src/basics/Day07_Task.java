package basics;

import java.util.Scanner;

public class Day07_Task {

	public static void main(String[] args) {
		
		
		for(int i=0; i <= 2; i++) {
			
			Scanner enterMonth = new Scanner(System.in);
			System.out.println("Enter the month you were born : ");
			String month = enterMonth.next(); // Dec
			
			switch(month.toLowerCase()) {
			case "jan":
				System.out.println("Winter");
				break;
			case "feb":
				System.out.println("Winter");
				break;
			case "mar":
				System.out.println("Winter");
				break;
			case "apr":
				System.out.println("Spring");
				break;
			case "may":
				System.out.println("Spring");
				break;
			case "jun":
				System.out.println("Spring");
				break;
			case "jul":
				System.out.println("Summer");
				break;
			case "aug":
				System.out.println("Summer");
				break;
			case "sep":
				System.out.println("Summer");
				break;
			case "oct":
				System.out.println("Fall");
				break;
			case "nov":
				System.out.println("Fall");
				break;
			case "dec":
				System.out.println("Fall");
				break;
				default:
					System.out.println("You have enterred a wrong month");
				
			}
		}
	}

}
