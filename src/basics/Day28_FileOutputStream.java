package basics;

import java.io.FileOutputStream;
import java.io.IOException;

public class Day28_FileOutputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Waqas Khan\\Desktop\\fos.txt");
		String text = "This text is an example of fileoutputstream class";

		byte[] b = text.getBytes();
		System.out.println(b.length);

		fos.write(b);
		fos.close();

	}

}
