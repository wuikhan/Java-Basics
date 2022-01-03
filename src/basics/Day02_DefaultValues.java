package basics;

public class Day02_DefaultValues {

	// declaring the variables means you only write the variable name with its data
	// type
	static byte a;
	static short b;
	static int c;
	static long d;
	static float f;
	static double g;
	static char h;
	static boolean i;
	

	public static void main(String[] args) {
		System.out.println("**** Default values ****");
		System.out.println(a); // 0
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println("**** String Concatenation ****");
		
		String j = "Hello"; // initialization
		// String k = "World";
		String k; // declared a variable K
		k = "World"; // initialized
		
		System.out.println(j + k);
		System.out.println(j + " " + k);
		
		
		String topic = "***** Operators *****";
		System.out.println(topic);
		
		System.out.println(5+5);
		int l = 11;
		int m = 5;
		System.out.println("The sum is : " + (l+m)); //16
		// The sum is 16
		
		int n = 5;
		int o = 10;
		int p = n+o;
		System.out.println(p); // 15
		
		System.out.println(o-n); // 5
		System.out.println(o * m); // 50
		System.out.println(l/n); // 2
		
		System.out.println(l%m); // 0
		
	}
}
