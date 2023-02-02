package polymorphism;

interface Demo{		
	void show();	
	
	void show(int i);
}

public class DynamicPolymorphismDemo implements Demo {

	@Override
	public void show() {
		System.out.println("show");		
	}
	
	@Override
	public void show(int i) {
		// TODO Auto-generated method stub
		System.out.println("show " + i);
		
	}
	
	public static void main(String...k) {
		Demo demo=  new DynamicPolymorphismDemo();
		demo.show();
		
	}

	
	
}
