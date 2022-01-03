package basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Day29_Collections {

	public static void main(String[] args) {
		String name = "John";
		System.out.println("Using String : " + name);

		String[] names = { "John", "Simon", "Kevin" }; // array
		
		System.out.println(names.length);
		System.out.println("Using Array " + names[0]);
		System.out.println("Using Array " + names[1]);
		System.out.println("Using Array " + names[2]);
		System.out.println(names);

		ArrayList<String> students = new ArrayList<String>();
		students.add("Peter");
		students.add("Chris");
		students.add("Max");
		students.add("Peter");
		System.out.println(students);
		students.add(3, "Kevan");
		System.out.println(students);

		students.remove("Peter");
		System.out.println(students);
		students.remove(3);
		System.out.println(students);

		students.set(0, "David"); // this is used to update the values present in that specific index
		System.out.println(students);

		int indexOfKevan = students.indexOf("Kevan");
		System.out.println(indexOfKevan);

		String stringOn1index = students.get(1); // Max
		System.out.println(stringOn1index);

		System.out.println("This is the size of the ArrayList : " + students.size());

		boolean isPresent = students.contains("David");
		System.out.println(isPresent);

		students.clear();
		System.out.println(students);
		students.add("Waqas");
		students.add("Peter");
		students.add("Chris");
		students.add("Max");
		students.add("Peter");
		students.add("Josue");
		students.add("Bilal");
		students.add("Carlos");
		students.add("MK");
		System.out.println(students);
		Collections.sort(students);
		System.out.println(students);
		
		
		System.out.println(students.get(0));
		System.out.println(students.get(1));
		System.out.println(students.get(2));
		System.out.println(students.get(3));
		
		System.out.println(students.size());
		
		for(int i=0;i<students.size();i++) {
			System.out.println(students.get(i));
		}
		
		// all the values are store in which variable ? students 
		
		for(String student : students) {
			System.out.println(student);
		}
		
		System.out.println("*****************************************");
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Mercedes");
		cars.add("Toyota");
		cars.add("Honda");
		
		Iterator<String> car = cars.iterator();
		
		System.out.println(car.hasNext());
		System.out.println(car.next());
		
		while(car.hasNext()) {
			System.out.println(car.next());
			car.remove();
		}
		
		System.out.println(cars);
		
	}
}
