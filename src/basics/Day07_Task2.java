package basics;

import java.util.Scanner;

public class Day07_Task2 {

	public static void main(String[] args) {

		for (int i = 0; i <= 2; i++) {

			Scanner enterMonth = new Scanner(System.in);
			System.out.println("Enter the month you were born : ");
			String month = enterMonth.next();

			if (month.equalsIgnoreCase("Jan")) {
				System.out.println("Winter");
			} else if (month.equalsIgnoreCase("Feb")) {
				System.out.println("Winter");
			} else if (month.equalsIgnoreCase("Mar")) {
				System.out.println("Winter");
			} else if (month.equalsIgnoreCase("Apr")) {
				System.out.println("Spring");
			} else if (month.equalsIgnoreCase("May")) {
				System.out.println("Spring");
			} else if (month.equalsIgnoreCase("Jun")) {
				System.out.println("Spring");
			} else if (month.equalsIgnoreCase("Jul")) {
				System.out.println("Summer");
			} else if (month.equalsIgnoreCase("Aug")) {
				System.out.println("Summer");
			} else if (month.equalsIgnoreCase("Sep")) {
				System.out.println("Summer");
			} else if (month.equalsIgnoreCase("Oct")) {
				System.out.println("Fall");
			} else if (month.equalsIgnoreCase("Nov")) {
				System.out.println("Fall");
			} else if (month.equalsIgnoreCase("Dec")) {
				System.out.println("Fall");
			} else {
				System.out.println("You have enterred a wrong month");
			}
		}
	}
}
