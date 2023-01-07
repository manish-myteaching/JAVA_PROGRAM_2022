package demo;

public  class Employee {
	
	static String companyName ="TCS";
	
    String employeeRollNo;
    String employeeName;
   
	static{
		System.out.println("static block");
		int ii=10;
		companyName="INfosys";		
	}
	
	Employee(String employeeRollNo,String employeeName){
		this.employeeRollNo=employeeRollNo;
		this.employeeName=employeeName;
	}
	
	
	
	public  void getEmployeeDetails() {		
		System.out.println("getEmployeeDetails");
		System.out.println(employeeRollNo + " || "+employeeName +" || "+companyName);
	}
	public void m() {
		this.getEmployeeDetails();
	}

	public static void main(String...k) throws ClassNotFoundException {	
		
		
		//only loading
		Class.forName("demo.Employee");
		
		
		//loading(Static) + object create(Heap Area)
		//Referance 
		Employee employee=new Employee("101","ABC");
		employee.getEmployeeDetails();
		
		
		//Directly
		new Employee("102","XYZ").getEmployeeDetails();
		
		new Employee("103","XYZ").getEmployeeDetails();
		
		new Employee("104","XYZ").getEmployeeDetails();
		
		new Employee("106","sgsg").getEmployeeDetails();
	
		new Employee("107","gsg").getEmployeeDetails();
		
		new Employee("108","gsg").getEmployeeDetails();
		
	
	}
	
	

}
