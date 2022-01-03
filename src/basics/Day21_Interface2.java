package basics;

// you dont know where you are going on vaccation
// you dont know activities you are going to do
// you dont know what places you are going to visit
// you dont know what type of food you are going to eat

interface vaccation {
	 void activities();
	 void places();
	 void food();
}

interface howManyDays {
	void location();
	void duration();
}

public class Day21_Interface2 implements vaccation, howManyDays {

	public static void main(String[] args) {
		Day21_Interface2 a = new Day21_Interface2();
		a.places();
		a.food();
		a.activities();
		a.location();
		a.duration();
	}

	public void activities() {
		System.out.println("we will do hiking");
	
	}
	public void places() {
		System.out.println("we are heading to west virginia");
	}


	public void food() {
		System.out.println("we ll do bbq");
	}

	public void location() {
		System.out.println("we ll stay at the cottage");
	}


	public void duration() {
		System.out.println("the duration is 2 weeks");
		
	}

}
