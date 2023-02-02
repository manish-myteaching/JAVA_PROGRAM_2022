package operators;

public class LogicalOpDemo {

	static void main(String[] args) {
		int a = 8, b = 7, c = 5;
		boolean d = (a < b) && (a < c);
		System.out.println(d);

		String addharno = "2999939990XXXXa";
		boolean dd = addharno.length() == 12 && addharno.isEmpty();
		System.out.println(dd);

		boolean ddd = (a < b) || (a < c);
		System.out.println(ddd);
		
		
		boolean dddd = !ddd;
		System.out.println(dddd);
		
		
		

	}

}
