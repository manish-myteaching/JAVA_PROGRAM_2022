package inheriatance;

public class A {

	private int i;
	static int j;

	public void show()  {
		System.out.println("show-A");
	}

	static void display() {
	}

	public static void main() {
		A a = new A();
		a.i = 10;
	}

}
