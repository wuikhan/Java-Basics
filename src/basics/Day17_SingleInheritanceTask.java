package basics;

class car {
 String color = "blue";
	boolean sedan = true;
	int year = 2021;
	String type = "honda";
	String model = "civic";
	
	public void carInformation() {
		System.out.println(color);
		System.out.println(sedan);
		System.out.println(year);
		System.out.println(type);
		System.out.println(model);
	}
}
public class Day17_SingleInheritanceTask extends car {

	public static void main(String[] args) {
		Day17_SingleInheritanceTask a = new Day17_SingleInheritanceTask();
		System.out.println(a.color);
		System.out.println(a.sedan);
		System.out.println(a.year);
		System.out.println(a.type);
		System.out.println(a.model);
		System.out.println("++++++++++++++++++++++");
		a.carInformation();
	}
}
