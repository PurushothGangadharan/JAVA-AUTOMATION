package week1day2;

public class Calculator {
	 public void add(int a,int b)
	    {
	    	int c=a+b;
	    	System.out.println(c);
	    }
	    public void sub(int a,int b)
	    {
	    	int c=a-b;
	    	System.out.println(c); 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Calculator cal=new Calculator();
      cal.add(20,20);
      cal.sub(25,5);
	}

}
