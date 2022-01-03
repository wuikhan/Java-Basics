package basics;


class thiskeyword {
	
	thiskeyword(){
		System.out.println("This is a 0 parameter constructor.");
	}
	
	thiskeyword(int a){
		this();
		System.out.println("This is a 1 parameter constructor."+a);
	}
	
	thiskeyword(int a, int b){
		this(5);
		System.out.println("this is a 2 parameter constructor "+(a+b));
	}
	
	thiskeyword(int a , int b, int c){
		this(10,20);
		System.out.println("This is a 3 parameter constructor "+(a+b+c));
	}
	
}

public class Day19_This {
	public static void main(String[] args) {
		thiskeyword b = new thiskeyword(100,20,40);
	}
}
