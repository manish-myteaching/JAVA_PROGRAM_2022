package method;

import classdbody.ClassDemo1;

public class MethodDemo1 {

	// non-static method
	public void show() {
		System.out.println("show");
	}

	// static method
	public  void display() {
		System.out.println("display");
	}

	public static void main(String... k) {

		// Declaration+Assignment
		MethodDemo1 cdd = new MethodDemo1();
		cdd.display();
		cdd.show();
	}

}
