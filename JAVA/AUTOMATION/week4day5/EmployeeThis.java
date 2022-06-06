package week4day5;

public class EmployeeThis {
	int empId;
	String empName;
	String empAddress;
	double empSalary;
	boolean isActive;
	char empInitial; 
	EmployeeThis(){
		System.out.println("default constructor ");
	}
	EmployeeThis(int id,String name,String address)
	{
		System.out.println("emp Id:"+id + "Emp name:"+name+ "address:"+address);

		//this();
		this.empId=id;
		this.empName=name;
		this.empAddress=address;
	}
	public static void main(String[] args) {
		EmployeeThis emp=new EmployeeThis(2,"sf","hjsdf");
		System.out.println();
		System.out.println();
		System.out.println();
		
	}

}
