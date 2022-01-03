package basics;

public class Day15_Variables {
	
	

	public static void main(String[] args) {
		// local variable
		int a = 10;
		System.out.println(a);
		
		Day15_InstanceVariable aa = new Day15_InstanceVariable();
		System.out.println(aa.countryName);
	}
	
	public static void methodOne() {
		// local variable
		int a = 20;
		System.out.println(a);
	}
}
