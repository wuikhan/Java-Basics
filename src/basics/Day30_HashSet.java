package basics;

import java.util.HashSet;
import java.util.Iterator;

public class Day30_HashSet {

	public static void main(String[] args) {

		HashSet<Integer> rollNumbers = new HashSet<Integer>();
		rollNumbers.add(100);
		rollNumbers.add(101);
		rollNumbers.add(102);
		rollNumbers.add(100);
		rollNumbers.add(103);
		rollNumbers.add(104);
		rollNumbers.add(105);
		rollNumbers.add(106);
		rollNumbers.add(107);
		rollNumbers.add(108);
		rollNumbers.add(109);
		rollNumbers.add(110);

		System.out.println(rollNumbers);

		Object copy = rollNumbers.clone();
		System.out.println(copy);

		boolean contains100 = rollNumbers.contains(1000); // true
		System.out.println(contains100);

		// Integer as a wrapper class
		Integer a = 100;
		System.out.println(a);

		boolean emp = rollNumbers.isEmpty(); // true or false
		System.out.println(emp);

		// rollNumbers.clear();

		System.out.println(rollNumbers.isEmpty());

		System.out.println(rollNumbers); // at this point it is empty

		if (rollNumbers.isEmpty()) {
			rollNumbers.add(500);
		}
		System.out.println(rollNumbers);
		System.out.println(rollNumbers.size());
		
		boolean removed102 = rollNumbers.remove(102);
		System.out.println(removed102);
		
		System.out.println(rollNumbers); // show 2 values
		
		Iterator<Integer> rollNum = rollNumbers.iterator();
		while(rollNum.hasNext()) {
			System.out.println(rollNum.next());
		}
	}
}
