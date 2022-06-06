package week4day5;

public class LearnStatic {
	public void getEmployeeDetails(String employeeName,int EmpId,String empDepartment) {
		System.out.println(employeeName+EmpId+empDepartment);
		//System.out.println(EmpId);
		//System.out.println(empDepartment);
	}
	
	public static void main(String[] args) {
		LearnStatic emp=new LearnStatic();
		emp.getEmployeeDetails("abc",53,"abc");
		
		
	}

}
