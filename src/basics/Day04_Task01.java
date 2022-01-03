package basics;

public class Day04_Task01 {

	public static void main(String[] args) {
		
		double a = 112.8734578834756834f;
		double b = 212.7368456374568347583f;
		double c = 312.83745364853745834765f;
		
		if(a > b) {
			if(a>c) {
				System.out.println("a is the biggest value");
			}
		} else if (b > a) {
			if(b > c) {
				System.out.println("B is the biggest value");
			} else {
				System.out.println("c has the biggest value");
			}
		} 
		
	}
}
