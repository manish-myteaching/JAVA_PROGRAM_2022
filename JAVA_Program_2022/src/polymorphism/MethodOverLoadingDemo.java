package polymorphism;

public class MethodOverLoadingDemo {
	
	int i=34;
	float f=34;
	
	
	public void show() {
		System.out.println("show");
	}


	public void show(int i) {
		System.out.println("int "+i);
	}

	public void show(float i) {
		System.out.println("float "+i);
	}
	
	public void show(String i) {
		System.out.println("String "+i);
	}

	public void show(Object i) {
		System.out.println("Object "+i);
	}
	
	

	public static void main(String... k) {
		new MethodOverLoadingDemo().show(null);
		

	}

}
