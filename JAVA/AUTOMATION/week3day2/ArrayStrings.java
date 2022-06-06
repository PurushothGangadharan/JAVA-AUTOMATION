package week3day2;

public class ArrayStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String name="TestLeaf";
     boolean equals=name.equals("TestLeaf");
     System.out.println(equals);
     
     boolean equals1=name.contains("TestLeaf");
     System.out.println(equals1);
     
     int length=name.length();
     System.out.println(length);
     char[] charArray=name.toCharArray();
     for(int i=length-1;i>=0;i--)
     {
    	 System.out.println(charArray[i]);
     }
     char charAt=name.charAt(4);
     System.out.println(charAt);
	}

}
