package week3day2;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {1,2,3,4,7,3,21,11,1,2,3,4,};
    int length= a.length;
    
    for(int i=0;i<=a.length-1;i++) {
        for(int j=i+1;j<a.length;j++) {
        	if(a[i]==a[j]) 
        	{
        		System.out.println(a[i]);
        	}
        	
        	
        }
    }
    	
    	
    }

		
		
		
		
	}
