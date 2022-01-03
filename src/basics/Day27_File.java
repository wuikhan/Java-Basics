package basics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Day27_File {

	public static void main(String[] args) throws IOException  {
		// create an object of the file class
		File file = new File("C:\\Users\\Waqas Khan\\Desktop\\sample1.txt");
		// create an object of the file writer class and pass file as an argument
		FileWriter fWrite = new FileWriter(file);
		// write it in the file
		fWrite.write("Hello, today we are learning IO class.");
		fWrite.close();
		System.out.println("program executed successfully.");
	}
}
