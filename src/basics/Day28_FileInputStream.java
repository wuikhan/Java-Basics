package basics;

import java.io.FileInputStream;
import java.io.IOException;

public class Day28_FileInputStream {

	public static void main(String[] args) throws IOException {
		
		String file = "C:\\Users\\Waqas Khan\\Desktop\\sample_new.txt";
		
		FileInputStream fis = new FileInputStream(file);
		int a = 0;
		while((a=fis.read()) != -1 ) {
			System.out.print((char) a);
		}
		fis.close();
		

	}

}
