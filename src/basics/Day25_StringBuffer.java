package basics;

public class Day25_StringBuffer {

	public static void main(String[] args) {
		
		String a = new String("Hello"); // String is immutable
		String aa = a.concat("World");
		String aaa = aa.concat("123");
		System.out.println(a);
		
		StringBuffer b = new StringBuffer("Hello"); // String Buffer is mutable that means is we can change the value of StringBuffer
		b.append("World");
		b.append("Today we are learning String Buffer");
		
		
		System.out.println(b);
		
		b.insert(1, "Wednessday");
		// insert a character z in your b variable instance
		System.out.println(b);
		
		b.reverse();
		System.out.println(b);
		
		b.delete(0, 7);
		System.out.println(b);
		
		b.deleteCharAt(5);
		System.out.println(b);
		
		b.reverse();
		System.out.println(b);
		
		
		b.replace(0, 20, "Hello World");
		System.out.println(b);
		
		StringBuilder c = new StringBuilder("Hello");
		c.append("World");
		System.out.println("StringBuilder : "+c);
		

	}

}
