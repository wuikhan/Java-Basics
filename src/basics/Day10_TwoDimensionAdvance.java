package basics;

public class Day10_TwoDimensionAdvance {

	public static void main(String[] args) {
	
		
		int[][] scores = {
				{ 10 , 20, 30, 40 },
				{ 50, 60 },
				{ 70, 80, 90 },
				{ 100, 110, 120, 130 }
		};
		
		System.out.println("Total Row Count : "+scores.length);
		
		for(int row = 0; row < scores.length; row++) {
			for(int col = 0; col < scores[row].length; col++) {
				System.out.println(scores[row][col]);
			}
		}

	}

}
