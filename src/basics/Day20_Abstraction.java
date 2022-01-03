package basics;

abstract class exampleA {
	abstract void sms();
	abstract void call();
	abstract void reject();
	abstract void addContact();
	
}

public class Day20_Abstraction extends exampleA {
	public static void main(String[] args) {

		Day20_Abstraction a = new Day20_Abstraction();
		a.day20();
		a.addContact();
		a.call();
		a.reject();
		a.sms();
	}

	public void day20() {
		System.out.println("Today is day 20 of java");
	}

	void sms() {
		System.out.println("This method will be used to send messages.");
	}

	void call() {
		System.out.println("This method will be used to make calls.");
	}

	void reject() {
		System.out.println("this method will be used to reject calls");
	}

	void addContact() {
		System.out.println("this method will be used to add contacts");
	}

}
