package basics;

class A {
	int a = 50;
	public void methodA() {
		System.out.println("This is called from methodA");
	}
} 
class B extends A {
	int b = 100;
	public void methodB() {
		System.out.println("This is called from methodB");
	}
}

class C extends B {
	int c = 200;
	public void methodC() {
		System.out.println("This is called from methodC");
	}
}

public class Day17_MultiLevelInheritance extends C {
	public static void main(String[] args) {
		
		Day17_MultiLevelInheritance obj = new Day17_MultiLevelInheritance();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		obj.methodA();
		obj.methodB();
		obj.methodC();
	}
}
