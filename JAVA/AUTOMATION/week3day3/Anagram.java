package week3day3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String text1="stops";
		String text2="potss";
		
		int length=text1.length();
		int lenght1=text2.length();
		System.out.println(length);
		System.out.println(lenght1);
		if(length==lenght1) {
			System.out.println("a word is anagram");
		}
			else
			{
			
				System.out.println("a word is not anagram");
			}
		String lowerCase=text1.toLowerCase();
		System.out.println(lowerCase);
		
		String lowerCase1=text2.toLowerCase();
		System.out.println(lowerCase1);
		
		String upperCase=text1.toUpperCase();
		System.out.println(upperCase);
		
		String upperCase1=text2.toUpperCase();
		System.out.println(upperCase1);
		
		char[] charArray=text1.toCharArray();
		System.out.println(charArray);

		
		char[] charArray1=text2.toCharArray();	
		System.out.println(charArray1);

		
		Arrays.sort(charArray);
		Arrays.sort(charArray1);
		System.out.println(charArray);
		System.out.println(charArray1);
		
		
		boolean equals = Arrays.equals(charArray, charArray1);
		if(equals==true) {
			System.out.println("a word is anagram");
		}
			else
			{
			
				System.out.println("a word is not anagram");
			}}
	
	
	
		}
