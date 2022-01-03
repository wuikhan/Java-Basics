package basics;

public class Day15_InstanceVariable {
	// Instance - Global Variable
	public String countryName = "USA";
	
	public static void main(String[] args) {
		
		Day15_InstanceVariable countryFirst = new Day15_InstanceVariable();
		System.out.println(countryFirst.countryName); // USA
		
		Day15_InstanceVariable countrySecond = new Day15_InstanceVariable();
		System.out.println(countrySecond.countryName); // USA
		
		Day15_InstanceVariable countryThird = new Day15_InstanceVariable();
		countryThird.countryName = "France";
		System.out.println(countryThird.countryName); // France
		
		System.out.println(countryFirst.countryName);
		System.out.println(countrySecond.countryName);
		
		Day15_InstanceVariable countryFour = new Day15_InstanceVariable();
		System.out.println(countryFour.countryName);

	}
}
