package polymorphism;

class Parent {

	void show() {
		System.out.println("show");
	}

	static void print() {
		System.out.println("print");
	}

}

public class MethodOverRidingDemo extends Parent {
	void show() {
		System.out.println("show-MethodOverRidingDemo");
	}

	static void print() {
		System.out.println("print-MethodOverRidingDemo");
	}

	public static void main(String... k) {
		MethodOverRidingDemo methodOverRidingDemo = new MethodOverRidingDemo();
		methodOverRidingDemo.show();
		
		Parent Parent = new MethodOverRidingDemo();
		Parent.show();
			
	}

}
