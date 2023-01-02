package classdbody;

public class ClassDemo1 {

	// variable
	int i;  // instance variable(predefined)
	float f;
	char c;
	
	static int ii; //class variable (predefined)
	
	Test test;//instance variable(User defined)
	static Test ttest; //class variable (User defined)

	// constructor
	ClassDemo1() {
      System.out.println("Constructor call..!");
	}

	// non-static method or instance method
	public void show() {
		  System.out.println("show");
	}

	// static method
	public static void display() {
		  System.out.println("display");
	}
	
	//Inner class
	class Test{
		
	}
	
	//interface
	interface Demo{
		
	}

	//enum
	enum Week{
		
	}
	
	public static void main(String... k) {
		ClassDemo1 cd; //Declaration
		cd= new ClassDemo1(); // Assignment
		
		//Declaration+Assignment
		ClassDemo1 cdd= new ClassDemo1();
				
	}

}
