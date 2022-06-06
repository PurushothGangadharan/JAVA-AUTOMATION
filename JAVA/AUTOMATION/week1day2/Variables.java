package week1day2;

public class Variables {
	String text;
	char c;
	boolean isVariable;
	double value;
	
	public void add() {
		int a=0;
		System.out.println(a);
		int b=4;
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Variables var=new Variables();
       System.out.println(var.text);
       System.out.println(var.c);
       System.out.println(var.isVariable);
       System.out.println(var.value);
       var.add();
	}

}
