package week4day5;

public class Employee {
	int empId;
	String empName;
	String empAddress;
	double empSalary;
	boolean isActive;
	char empInitial; 
	Employee(){
		System.out.println("default constructor ");
	}
	Employee(int id,String name,String address)
	{
		System.out.println("emp Id:"+id + "Emp name:"+name+ "address:"+address);
	}
	public static void main(String[] args) {
		int a=10;
		Employee emp=new Employee(123,"wekh","je");
		
//		Employee emp=new Employee();
//		System.out.println(emp.empId);
//		System.out.println(emp.empName);
//		System.out.println(emp.empAddress);
//		System.out.println(emp.empSalary);
//		System.out.println(emp.isActive);
//		System.out.println(emp.empInitial);

		


		
	}

	

}
