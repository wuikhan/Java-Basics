package basics;

public class Day24_String {

	public static void main(String[] args) {
		
		String mixCharacters = "0C1l2A3o4P5w6I7e8T9rAc@L#a$L%s^E&e*T(l)TeEtRtSers";
		
		System.out.println(mixCharacters);
		
		String noNumbers = mixCharacters.replaceAll("[0-9]", "");
		
		System.out.println(noNumbers);
		
		String noCapitalsLetters = mixCharacters.replaceAll("[A-Z]", "");
		
		System.out.println(noCapitalsLetters);
		
		String noLowercaseLetters = mixCharacters.replaceAll("[a-z]", "");
		
		System.out.println(noLowercaseLetters);
		
		String onlySpecialCharacters = mixCharacters.replaceAll("[A-Za-z0-9]", "");
		System.out.println(onlySpecialCharacters);
		
		
		String noSpecialCharacters = mixCharacters.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(noSpecialCharacters);
		
		// print only capital letters
		// print only lower case letters
		// print only numbers
		
		String onlyCaps = mixCharacters.replaceAll("[^A-Z]", ""); //CAPITALLETTERS		
		System.out.println(onlyCaps);
		System.out.println(mixCharacters.replaceAll("[^a-z]", ""));
		System.out.println(mixCharacters.replaceAll("[^0-9]", ""));
		System.out.println(mixCharacters.replaceAll("[^!-+]", ""));
		
		
		char[] c = onlyCaps.toCharArray(); //CAPITALLETTERS	
		
//		System.out.println(c[0]);
//		System.out.println(c[1]);
		
		for(int i=0;i < c.length;i++) {
			System.out.println(c[i]);
		}
		
		
	String randomText = "In it except to so temper mutual tastes mother. Interested cultivated its continuing now yet are. Out interested acceptance our partiality affronting unpleasant why add. Esteem garden men yet shy course. Consulted up my tolerably sometimes perpetual oh. Expression acceptance imprudence particular had eat unsatiable.";
	
	String[] returnedText = randomText.split(" ");
	System.out.println(returnedText.length);
	
	for(int i=0;i < returnedText.length ; i++) {
		System.out.println(returnedText[i]);
	}
		

	}

}
