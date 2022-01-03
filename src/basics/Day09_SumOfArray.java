package basics;

public class Day09_SumOfArray {

	public static void main(String[] args) {
	
		int[] values = { 10, 22, 23, 25, 20 };
		int sum = 0;
		
		for (int i=0 ; i < values.length ; i++) {
			
			sum = sum + values[i];
			
		}
		
		System.out.println(sum);

	}

}
