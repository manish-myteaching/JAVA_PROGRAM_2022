package operators;

public class ConditionalOprDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a=8,b=7;
		//int c= (a>b)?a:b;
		
		int a=8,b=7,c=9;
		int d=(a>b)&&(a>c)?a:(b>c)?b:c;		
		
		System.out.println(d);

	}

}
