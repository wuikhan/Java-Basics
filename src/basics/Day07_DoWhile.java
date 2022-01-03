package basics;

public class Day07_DoWhile {

	public static void main(String[] args) {

		int i = 20;

		do {
			System.out.println("The value of i is : " + i);
			if(i == 8) {
				System.out.println("The value is "+i);
				break;
			}
			i++;
		} while (i < 10);

	}

}
