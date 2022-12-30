
public class Demo {
	public int rollNo=10;
	public static String name="manish";
	
    Demo(){
       int rollNo1=10; 
	}
	
	public void show() {
	    int rollNo1=10;
	}
	
	
	public static void main(String...arg) {	
		Demo demo=new Demo();
		Demo demo2=new Demo();
		Demo demo3=new Demo();
		Demo demo4=new Demo();
		Demo demo5=new Demo();
				
		
		System.out.println(demo.rollNo);
		System.out.println(demo.name.length());
		//System.out.println(demo2);
		//System.out.println(demo3);
		//System.out.println(demo4);		
			
	}

}
