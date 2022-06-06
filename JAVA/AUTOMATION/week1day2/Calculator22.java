package week1day2;

public class Calculator22 {
public int add(int a,int b) {
	int total=a+b;
	//System.out.println();
	return total;
}
public void sub(int totalValues,int d) {
	int z=totalValues-d;
	System.out.println(z);
	}
public static void main(String[] args) {
	Calculator22 cal=new Calculator22();
			int totalValues=cal.add(100,100);
			System.out.println(totalValues);
        	cal.sub(totalValues,100);
}
}

