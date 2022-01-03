package basics;

public class Day08_Arrays {

	public static void main(String[] args) {
				
	// declare an array variable
		//String[] countries;
		
		String[] countries = new String[5];
		countries[0] = "USA";
		countries[1] = "China";
		countries[2] = "Russia";
		countries[3] = "Canada";
		countries[4] = "Australia";
		
		System.out.println(countries[0]);
		System.out.println(countries[1]);
		
		int[] age = new int[5];
		age[0] = 20;
		age[1] = 21;
		age[2] = 22;
		age[3] = 23;
		age[4] = 24;
		
		System.out.println(age[4]);
		
		
		String[] country = { "USA", "China", "Russia", "Canada", "Australia" };
		System.out.println(country[4]);
		
		int[] ages = { 23, 33, 32, 25, 19, 21, 22 };
		System.out.println(ages[5]);
		
	}

}
