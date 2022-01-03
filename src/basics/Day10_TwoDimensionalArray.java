package basics;

public class Day10_TwoDimensionalArray {

	public static void main(String[] args) {

		String[][] countries = { 
				{ "USA", "Canada" }, 
				{ "Pakistan", "Afghanistan", "Australia" }

		};

		System.out.println("Row Count > "+countries.length);

		for (int row = 0; row < countries.length; row++) {
			System.out.println("Column in "+row +" row "+countries[row].length);
			for (int col = 0; col < countries[row].length; col++) {
				System.out.println(countries[row][col]);
			}
		}
		
	
		
		
		
		
		
		
		
//		int[] a = new int[5];
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		a[3] = 40;
//		a[4] = 50;
//
//		System.out.println(a[4]);
//
//		// 2D Array
//		int[][] data = new int[3][4];
//		data[0][0] = 10;
//		data[0][1] = 20;
//		data[0][2] = 30;
//		data[0][3] = 40;
//
//		data[1][0] = 50;
//		data[1][1] = 60;
//		data[1][2] = 70;
//		data[1][3] = 80;
//
//		data[2][0] = 90;
//		data[2][1] = 100;
//		data[2][2] = 110;
//		data[2][3] = 120;
//
//		System.out.println(data[2][1]);
//		// Create a 2D array and store different names the size of the row is 5 and size for the column would be 6
//		
//		
//		String [][] names = new String [5][6];
//		names[0][0]="bob";
//		names[0][1]="mike";
//		names[0][2]="bobs";
//		names[0][3]="bobbs";
//		names[0][4]="bobby";
//		names[0][5]="bobb";
//		
//		names[1][0]="mikes";
//		names[1][1]="mike";
//		names[1][2]="micheal";
//		names[1][3]="mark";
//		names[1][4]="moby";
//		names[1][5]="mini";
//		
//		
//		names[2][0]="jose";
//		names[2][1]="javier";
//		names[2][2]="james";
//		names[2][3]="jony";
//		names[2][4]="joseph";
//		names[2][5]="jorge";
//		
//		names[3][0]="harry";
//		names[3][1]="henary";
//		names[3][2]="horse";
//		names[3][3]="hoff";
//		names[3][4]="hurrly";
//		names[3][5]="hobby";
//		
//		names[4][0]="tina";
//		names[4][1]="tori";
//		names[4][2]="tanny";
//		names[4][3]="tommy";
//		names[4][4]="tim";
//		names[4][5]="teshia";
//		
//		
//		
//		System.out.println(names[4][3]);

	}
}
