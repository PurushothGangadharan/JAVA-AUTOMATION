package week4day5;

public class Parameterizedconstructor {
	public static void main(String[] args) {
		
	}

	Employee(){
		System.out.println("default constructor ");
	}
	Employee(int id,String name,String address)
	{
		System.out.println("emp Id:"+id + "Emp name:"+name+ "address:"+address);
	}
	public static void main(String[] args) {
		int a=10;
		Employee emp=new Employee(123,"sdhg","asgdsd");

}}
