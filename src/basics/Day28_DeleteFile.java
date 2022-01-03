package basics;

import java.io.File;

public class Day28_DeleteFile {

	public static void main(String[] args) {

//		File file = new File("C:\\Users\\Waqas Khan\\Desktop\\sample.txt");

		String location = "C:\\Users\\Waqas Khan\\Desktop\\sample1.txt";
		File file = new File(location);

		// System.out.println(file.exists());

		if (file.exists()) {
			System.out.println("File exists");
			file.delete();
			System.out.println("File deleted successfully.");
		} else {
			System.out.println("File does not exists");
		}
		
		
		File oldFile = new File("C:\\Users\\Waqas Khan\\Desktop\\sample.txt");
		File newFile = new File("C:\\Users\\Waqas Khan\\Desktop\\sample_new.txt");
		
		if(oldFile.renameTo(newFile)) {
			System.out.println("File renamed successful");
		} else {
			System.out.println("File rename was un-successful");
		}
	}
}
