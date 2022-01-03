package basics;

import java.util.HashSet;

public class Day30_HashSetToArray {

	public static void main(String[] args) {
		
		HashSet<Character> alphabets = new HashSet<Character>();
		alphabets.add('a');
		alphabets.add('b');
		alphabets.add('c');
		alphabets.add('d');
		alphabets.add('e');
		
		Character[] alpha = new Character[alphabets.size()];
		alphabets.toArray(alpha);
		System.out.println("Hashset : " +alphabets);
		System.out.println("Array : "+alpha);
		
		for(char singleAlphabet : alpha) {
			System.out.println(singleAlphabet);
		}
	}

}
