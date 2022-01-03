package basics;

import java.util.ArrayList;
import java.util.HashSet;

public class Day30_HashSetToArrayList {

	public static void main(String[] args) {
		
		HashSet<String>  names = new HashSet<String>();
		names.add("John");
		names.add("Chris");
		names.add("Max");
		names.add("John");
		
		System.out.println(names);
		names.add("John");
		System.out.println(names);
		
		ArrayList<String> studentNames = new ArrayList<String>(names);
		studentNames.add("John");
		studentNames.add("Chris");
		
		System.out.println(studentNames);
		
		
		for(String name : studentNames) {
			System.out.println(name);
		}

	}

}
