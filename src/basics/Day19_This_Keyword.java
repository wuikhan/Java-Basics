package basics;

class Student {
	int rollnum;
	String name;
	int coursefee;
	int howOld;
	
	Student(int rollnum, String name, int coursefee, int age){
		this.rollnum = rollnum; // both variable names are same java will not assign proper values if you dont use this keyword
		this.name = name;
		this.coursefee = coursefee;
		this.howOld = age; // both variable names are different java will properly assign the values
	}

	public void displayData() {
		System.out.println("The roll number is : "+rollnum);
		System.out.println("The name is : "+name);
		System.out.println("The course fee is : "+coursefee);
		System.out.println("The age of student is : "+howOld);
	}
}

public class Day19_This_Keyword {

	public static void main(String[] args) {
		
		Student studentOne = new Student(100, "John", 3000, 30);
		studentOne.displayData();
		
		Student studentTwo = new Student(200, "Steve", 4000, 25);
		studentTwo.displayData();
	}

}
