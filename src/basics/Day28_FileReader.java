package basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day28_FileReader {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Waqas Khan\\Desktop\\sample1.txt");
		try {
			// new instance
			FileReader fread = new FileReader(file);
//			System.out.println(fread.read());
			int a=0;
			while((a=fread.read()) != -1) {
				System.out.print((char)a);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("some more code after the file exception");
	}
}
