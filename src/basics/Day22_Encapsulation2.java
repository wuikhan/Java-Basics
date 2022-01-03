package basics;

public class Day22_Encapsulation2 {

	public static void main(String[] args) {
		Day22_Encapsulation1 phoneOne = new Day22_Encapsulation1();

//		phoneOne.model = "11";
//		phoneOne.imei = 12345;
//		phoneOne.make = "Apple";
//		
//		System.out.println(phoneOne.model);
//		System.out.println(phoneOne.imei);
//		System.out.println(phoneOne.make);
		phoneOne.setModel("13 max");

		System.out.println(phoneOne.getModel());

		phoneOne.setImei(333);
		System.out.println(phoneOne.getImei());

		phoneOne.setMake("Iphone");
		String phoneOneMake = phoneOne.getMake();
		System.out.println(phoneOneMake);
		
		Day22_Encapsulation1 phoneTwo = new Day22_Encapsulation1();
		phoneTwo.setModel("S20");
		phoneTwo.setImei(11111);
		phoneTwo.setMake("Samsung");
		
		System.out.println(phoneTwo.getModel());
		System.out.println(phoneTwo.getImei());
		System.out.println(phoneTwo.getMake());
	}
}
