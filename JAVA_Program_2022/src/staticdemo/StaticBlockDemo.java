package staticdemo;

public class StaticBlockDemo {
	static int i = 10;
	{
		System.out.println("non-static-block");
	}

	StaticBlockDemo() {
		System.out.println("StaticBlockDemo");
	}

	static {
		System.out.println(i);
		System.out.println("static-block");
	}

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		// load + object create
		// StaticBlockDemo staticBlockDemo=new StaticBlockDemo();

		
		// only loading
		Class c = Class.forName("staticdemo.StaticBlockDemo");	
		// object create
		StaticBlockDemo sb = (StaticBlockDemo) c.newInstance();
		
		

	}

}
