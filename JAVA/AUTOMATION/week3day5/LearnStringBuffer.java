package week3day5;

public class LearnStringBuffer {
	public static void main(String[] args) {
		StringBuffer buffer=new StringBuffer("testleaf");
		buffer.append("org");
		System.out.println(buffer);
		
		StringBuffer rev=new StringBuffer("testleaforg");
		StringBuffer reverse=rev.reverse();
		System.out.println(reverse);	
	}
}
