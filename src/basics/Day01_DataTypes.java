package basics;

public class Day01_DataTypes {

	public static void main(String[] args) {

//		byte
//		min -128 
//		max 127
//		Ctrl + / (to comment-out the code)

		byte age = 100; // initialized the value
		System.out.println(age);

//		Short
//		-32768
//		32767
		
		short atm_deposit = 32767;
		System.out.println(atm_deposit);
// 		ctrl + shift + f (to fix the formatting of the code)
		
//		int 
//		min -2147483647
//		max 2147483646
		int accountBalance = 2147483646;
		System.out.println(accountBalance);
		
//		syso + ctrl + space + enter for windows
//		syso + ctrl + space for mac
		
//		Long
//		min -600851475143L
//		max 600851475142L
		long distance = 600851475144278342L;
		System.out.println(distance);
		
		// float
		// supports upto 6 digits after the decimal
		float temp = 11.12345678910f;
		System.out.println(temp);
		
		// double
		// supports upto 15 digits after the decimal
		double dist = 22.1782381623812648124836826483726486f;
		System.out.println(dist);
		
		// char
		char gender = 'F';
		System.out.println(gender);
		
		// boolean
		// true or false
		boolean isLogoPresent = true;
		System.out.println(isLogoPresent);
		
		// String Class
		// default value is null, it is a group of characters enclosed in double quotes
		String myName = "Waqas Khan 1234567890 !@#$%^&*()_+=-";
		System.out.println(myName);
			
	}

}
