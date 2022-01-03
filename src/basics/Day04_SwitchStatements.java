package basics;

import java.util.Scanner;

public class Day04_SwitchStatements {

	public static void main(String[] args) {
		
		// what are we going to create ?
		Scanner month = new Scanner(System.in);
		
		System.out.println("Enter the month : ");
		int month_index = month.nextInt();
		
		
		switch(month_index) {
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("Jun");
			break;
		case 7:
			System.out.println("Jul");
			break;
		case 8:
			System.out.println("Aug");
			break;
			default:
				System.out.println("The month does not exist in the list.");
		
		}

	}
	

}
