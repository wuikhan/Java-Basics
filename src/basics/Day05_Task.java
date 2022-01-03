package basics;

import java.util.Scanner;

public class Day05_Task {

	public static void main(String[] args) {

		Scanner takeInput = new Scanner(System.in);
		System.out.println("What is your yearly income ?");
		int income = takeInput.nextInt();

		System.out.println("What is your credit score ? e.g poor, good, excellent ?");
		String creditScore = takeInput.next();

		if ((income > 30000) && (income < 50000)) {

			if (creditScore.equalsIgnoreCase("poor")) {
				System.out.println("5000");

			} else if (creditScore.equalsIgnoreCase("good")) {
				System.out.println("10000");

			} else if (creditScore.equalsIgnoreCase("excellent")) {
				System.out.println("20000");
			} else {
				System.out.println("denied");
			} 
		} else if (income > 50000 && income < 100000) {

			if (creditScore.equalsIgnoreCase("poor")) {
				System.out.println("10000");
			} else if (creditScore.equalsIgnoreCase("good")) {
				System.out.println("20000");
			} else if (creditScore.equalsIgnoreCase("excellent")) {
				System.out.println("30000");
			} else {
				System.out.println("denied");
			}

		} else if (income > 100000) {

			if (creditScore.equalsIgnoreCase("poor")) {
				System.out.println("30000");
			} else if (creditScore.equalsIgnoreCase("good")) {
				System.out.println("50000");
			} else if (creditScore.equalsIgnoreCase("excellent")) {
				System.out.println("60000");
			} else {
				System.out.println("denied");
			}

		} else {
			System.out.println("denied");
		}

	}

}
