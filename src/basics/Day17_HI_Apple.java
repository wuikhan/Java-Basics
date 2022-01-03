package basics;

public class Day17_HI_Apple extends Day17_HI_Mobile {
	public static void main(String[] args) {
		Day17_HI_Apple phoneOne = new Day17_HI_Apple();
		phoneOne.imei = "uahsdiuahs178263";
		phoneOne.year = 2021;
		phoneOne.type = "smart phone";
		System.out.println(phoneOne.imei);
		System.out.println(phoneOne.type);
		System.out.println(phoneOne.year);
		phoneOne.call();
	}
}