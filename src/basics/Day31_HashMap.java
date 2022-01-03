package basics;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Day31_HashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> studentNames = new HashMap<Integer, String>();

		studentNames.put(100, "John");
		studentNames.put(200, "Chris");
		studentNames.put(300, "Abdullah");
		studentNames.put(400, "Abubakar");
		studentNames.put(500, "Anna");
		studentNames.put(600, "Bilal");
		studentNames.put(700, "Carlos");
		studentNames.put(800, "Iqbal");

		System.out.println(studentNames);

		HashMap<Integer, String> courseFee = new HashMap<Integer, String>();
		courseFee.putAll(studentNames);
		System.out.println("Course Fee Object : " + courseFee);

		studentNames.remove(300);
		System.out.println("After removing roll number 300 :" + studentNames);

		studentNames.remove(200, "Chris");
		System.out.println("After removing roll number 200 and Chris as a value :" + studentNames);

		String get800 = studentNames.get(800);
		System.out.println(get800);

		boolean present400 = studentNames.containsKey(400);
		System.out.println(present400);

		boolean presentJohn = studentNames.containsValue("John");
		System.out.println(presentJohn);

		Object studentsClone = studentNames.clone();
		System.out.println("HashMap :" + studentNames);
		System.out.println("Object > Clone : " + studentsClone);

		studentNames.clear(); // it will delete everything
		System.out.println("After using clear method :" + studentNames);

		boolean emp = studentNames.isEmpty(); // true

		System.out.println(emp);

		studentNames.put(100, "John");
		studentNames.put(200, "Chris");
		studentNames.put(300, "Abdullah");
		studentNames.put(400, "Abubakar");
		studentNames.put(500, "Anna");
		studentNames.put(600, "Bilal");
		studentNames.put(700, "Carlos");
		studentNames.put(800, "Iqbal");

		System.out.println("HashMap :" + studentNames);
		
		// capture the keys of HashMap obj
		Set<Integer> hmKeys = studentNames.keySet();
		System.out.println("All the Keys present in the HashMap obj : "+hmKeys);
		
		
		Collection<String> hmValues = studentNames.values();
		System.out.println("All the Values present in the HashMap obj : "+hmValues);
		
		System.out.println("The size of HashMap is : "+studentNames.size());
		
		// iterator is not accessible with Map so we will have to convert this into set
		Set<Entry<Integer, String>> names = studentNames.entrySet();
		// Set name = studentNames.entrySet(); // this was supported before java version 1.7

		Iterator<Entry<Integer, String>> it = names.iterator();

		while (it.hasNext()) {
			Entry<Integer, String> st = it.next();
			System.out.println("****** Key : Value pair ******");
			System.out.println(st);
			System.out.println("****** Key ******");
			System.out.println(st.getKey());
			System.out.println("****** Value ******");
			System.out.println(st.getValue());
		}
	}
}
