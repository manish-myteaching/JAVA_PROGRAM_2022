package constuctor;



public class ConstructorDemo {
	
	int i;
	String s;
		
	
	//default constructor
	ConstructorDemo(){
		System.out.println("default");
		System.out.println(i+" "+s);		
		this.i=0;
		this.s=null;
		
	}
	
	ConstructorDemo(int a,String s){
		i=a;
		s=s;
		this.show();
	}
	
	
	
	void show() {
		System.out.println("show");
		System.out.println(this.i+" "+this.s);		
	}
	
	
	
	public static void main(String...k) {
		//default constructor
		ConstructorDemo test=new ConstructorDemo();			
		
		
		//Parameterize constructor
		ConstructorDemo test1=new ConstructorDemo(10,"manish");
		
		ConstructorDemo test2=new ConstructorDemo(20,"xyz");
		
		ConstructorDemo test3=new ConstructorDemo(30,"ccc");

						
				
	}

}
