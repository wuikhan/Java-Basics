package basics;

class Batch {
	int numberOfStudents = 10;
	public void duration() {
		System.out.println("The duration for the course is 5 months.");
	}
}

class Batch01 extends Batch {
	
	int numberOfStudents = 8;
	public void duration() {
		System.out.println("The duration for this course is 6 months.");
	}
	
	public void students() {
		System.out.println("The number of students are : "+numberOfStudents); // 8
		System.out.println("The number of students from the parent class : "+super.numberOfStudents); // 10
		duration(); // this is going to return me the method from the child class
		super.duration(); // using the super keyword it is going to return the method from the parent class.
	}
}

public class Day19_SuperKeyword extends Batch01 {
	public static void main(String[] args) {
		Day19_SuperKeyword a = new Day19_SuperKeyword();
		a.students();
	}
}
