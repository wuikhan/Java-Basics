package basics;

public class Day23_String {

	public static void main(String[] args) {
		
		String a = "HellO";
		String b = "hello";
		String aa = new String("Hello World");
		
		System.out.println(a.length());
		
		int returnValue = aa.length(); // int 11
		System.out.println(returnValue);
		
		String lowerAA = aa.toLowerCase();
		System.out.println(lowerAA);
		
		System.out.println(aa);
		
		String upperAA = aa.toUpperCase();
		System.out.println("This is using toUpperCase method : "+upperAA);
		
		boolean c = a.equalsIgnoreCase(b);
		System.out.println(c);
		
		String studentA = "John";
		String studentB = "john"; //greater unicode value
		String studentC = "MIKE";
		String studentD = "MIKE";
		
		int compareStudents = studentA.compareTo(studentB);
		System.out.println(compareStudents); // -32 because student B has a greater unicode value
		
		int sameName = studentC.compareTo(studentD);
		System.out.println(sameName);
		
		int sameNameIgnoreCasing = studentA.compareToIgnoreCase(studentB); // 0
		System.out.println("This should return us 0 : "+sameNameIgnoreCasing);
		
		String fName = "John";
		String lName = "Doe";
		System.out.println(fName.concat(" ").concat(lName)); // JohnDoe
		
		String day = "          Today we are learning String class                       ";
		String trimmedDay = day.trim(); // Today we are learning String class
		
		System.out.println(day);
		System.out.println(trimmedDay);
		
		System.out.println(day.length());
		System.out.println(trimmedDay.length());
		
		boolean startsWithTrimmedDay = trimmedDay.startsWith("today");
		System.out.println(startsWithTrimmedDay); // true
		
		boolean endsWithTrimmedDay = trimmedDay.endsWith("class");
		System.out.println(endsWithTrimmedDay); // true
		
		char chartAtTrimmedDay = trimmedDay.charAt(0); // T
		System.out.println("The char present at 0 index is : "+chartAtTrimmedDay);
		
		int indexOfa = trimmedDay.indexOf('a');
		System.out.println(indexOfa);
		
		String subStringBegin = trimmedDay.substring(6);
		System.out.println(subStringBegin);
		
		String subStringEnd = trimmedDay.substring(6, 21);
		System.out.println(subStringEnd);
		
		String randomText = "C0deg@t0r";
		String replacedZero = randomText.replace('0', 'o').replace('@', 'a');
		System.out.println(replacedZero);
		
		
	}
}
