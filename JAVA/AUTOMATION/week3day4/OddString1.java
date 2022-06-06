package week3day4;

public class OddString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String name="testleaf";
     int length=name.length();
     System.out.println(length);
     char[] array=name.toCharArray();
     
     for (int i=0;i<length;i++)
     {
    	 if(i%2!=0)
    	 {
    		 System.out.print(Character.toUpperCase(array[i]));
    	 }
    		 else
    		 {
    			 System.out.print(array[i]);
    			 
    		 }
    	 }
     }
     
     
	}

