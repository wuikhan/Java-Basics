package basics;


class faculty {
	String profName = "Steve";
	int age = 48;
	
	public void teacher() {
		System.out.println("Prof Steve is the teacher");
	}
}


public class Day17_SingleInheritance extends faculty {
	String schoolName = "George Mason";

	public static void main(String[] args) {
		Day17_SingleInheritance a = new Day17_SingleInheritance();
		System.out.println(a.profName);
		System.out.println(a.schoolName);
		a.teacher();
	}
}
