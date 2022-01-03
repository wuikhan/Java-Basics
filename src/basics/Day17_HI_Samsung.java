package basics;

public class Day17_HI_Samsung extends Day17_HI_Mobile {
	public static void main(String[] args) {
		Day17_HI_Samsung phoneTwo = new Day17_HI_Samsung();
		phoneTwo.imei = "UADUISAD*&*ASD&^ASd";
		phoneTwo.year = 2021;
		phoneTwo.type = "smart phone";
		System.out.println(phoneTwo.imei);
		System.out.println(phoneTwo.type);
		System.out.println(phoneTwo.year);
		phoneTwo.call();
	}
}