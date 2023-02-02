package staticdemo;

public class StatucVarMethodDemo {
	
	// variable
	static	int i;  //class variable (predefined)
	static	float f;
	static	char c;
		
	// static method
	public static void show() {
		System.out.println("show");
	}

	// static method
	public static void display() {
		System.out.println("display");
	}

	
	public static void main(String... k) {
		//call static method
		show();
		display();
	}

}
