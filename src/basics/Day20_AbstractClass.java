package basics;

abstract class application {
	 abstract void login();
	abstract void logout();
	abstract void registration();
	abstract void resetPassword();
	void applicationExample() {
		System.out.println("This is a concrete method");
	}
	application(){
		System.out.println("this is a constructor");
	}
}

abstract class qaApp extends application {
	
	void login() {
		System.out.println("This is a login method");
	}
	void logout() {
		System.out.println("This is a logout method");
	}
}

class class21{
	
}

public class Day20_AbstractClass extends qaApp{
	
	void login() {
		System.out.println("This is a login method from Day20_AbstractClass");
	}

	public static void main(String[] args) {
		Day20_AbstractClass aa = new Day20_AbstractClass();
		aa.login();
		aa.logout();
		aa.registration();
		aa.resetPassword();
	}

	void registration() {
		System.out.println("This is a registration method");
	}

	void resetPassword() {
		System.out.println("This is reset password method");
	}
}
