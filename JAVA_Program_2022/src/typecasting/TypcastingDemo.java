package typecasting;

class A {

	private void show()  {
		System.out.println("A");
		
		
	}
}

class B extends A {
	public  void show() {
		System.out.println("B");
	}
}

public class TypcastingDemo {
	
	
	public static void main(String...k) {
		A a=new A();
		B b=new B();
		
		A aa=new B(); //upcasting automatic
		
		B bb=(B)aa; // downcasting
				
		Object obj=new B();
		B bbb=(B)obj;
		
				
		float f=45;
		int i=(int)f;
		
		
		
	}
	
	
	

}
