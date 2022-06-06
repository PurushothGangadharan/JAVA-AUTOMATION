package week3day1;

import java.util.Arrays;

public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	//char arr[]={'a','b','c','d','e','f','g','h','i'};
	//int length=arr.length;
	//System.out.println(length);
	//System.out.println(arr[0]);
	//System.out.println(arr[length-2]);
	
	//char arr1[]= {4,7,7,8};
	//arr1[3]=45;
	//System.out.println(Arrays.toString(arr1));
		
	int[] var= {1,2,9,4,5,4,7,8,2,10};
	var[4]=03;
	
	for(int i=0;i<10;i++){
		System.out.print(var[i]+",");
		Arrays.sort(var);
		
	}	
	}
}
