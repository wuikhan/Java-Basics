package basics;

public class Day09_AdvanceLoop {

	public static void main(String[] args) {
		String[] countries = { "USA", "Australia", "Canada", "Belgium", "Germany", "Austria", "Colombia", "Brazil" };

		// advance loop or for each loop

		for (String country : countries) {
			System.out.println(country);
		}

		int[] ages = { 12, 22, 23, 32, 22, 13, 32 };

		for (int age : ages) {
			System.out.println(age);
		}

		// store different characters and print those characters

		char[] characters = { 'W', 'A', 'Q', 'A', 'S' };
		for (char character : characters) {
			System.out.println(character);
		}
	}
}
