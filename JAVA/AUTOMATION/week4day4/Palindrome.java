package week4day4;

public class Palindrome {
	public static void main(String[] args) {
		
    String palin="MODOM";
	String palindrome="";
	//char[] chararray=palin.toCharArray();
		for (int i= palin.length()-1;i>=0; i--) {
			
			palindrome=palindrome+palin.charAt(i);}
			System.out.println(palindrome);

			if(palindrome.equals(palin))
				
				System.out.println("palindrome");
			else
			{
				System.out.println("not a palindrome");

			}
		}}
			//if(palindrome.equals(palin)) 
			
