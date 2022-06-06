package week3day1;

import java.util.Arrays;

public class ArrayLearnimg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 int array[]= {1,2,3,4,5,6,7,8,9,10,455,466,778,234,6,56,7,32143,65,8,97,565,5,4,46,568,5563,44,32,36,457,567,3,34};
 array[4]=5678;
 int length=array.length;
 System.out.println(length);
 //for(int i=0;i<34;i++)
 //{
	// System.out.print(array[i]+",");
// }
 //reverse
     for(int i=length-1;i>=0;i--)
{
	 System.out.print(array[i]+",");
}
 
 
	}

}
