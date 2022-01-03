package basics;

abstract class shape {
	abstract void rectangleArea(int length, int width);
	abstract void squareArea(int side);
	abstract void circleArea(int radius);
}
class Area extends shape {
	void rectangleArea(int length, int width) {
		System.out.println(length * width);
	}
	void squareArea(int side) {
		System.out.println(side);
	}
	void circleArea(int radius) {
		System.out.println(2 * 3.14 * radius);
	}
}
public class Day22_Task1 {
	public static void main(String[] args) {
		Area a = new Area();
		a.rectangleArea(3, 4);
		a.squareArea(4);
		a.circleArea(5);
	}
}
