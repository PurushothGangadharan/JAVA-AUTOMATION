package week3day3;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		//String name="Rio";
		//String name1="Rio";
		//String name2="De";
		String text="123 jjhsvjsvg #$@$@$";

		//lower case
		//String lowerCase=name.toLowerCase();
		//System.out.println(lowerCase);
		//uppercase
		//String upperCase=name.toUpperCase();
		//System.out.println(upperCase);
		//concat
		//String concat = name1.concat(" ").concat(name2);
		//System.out.println(concat);
		//replace
		//String replace = name1.replace("i", "i");
				//System.out.println(replace);
		
		//repalceAll
		//String replaceAll=text.replaceAll("\\s","");
		//String replaceAll=text.replaceAll("\\d","");
		//String replaceAll=text.replaceAll("\\D","");
		//String replaceAll=text.replaceAll("\\W","");
		String replaceAll=text.replaceAll("\\w","");
		System.out.println(replaceAll);
	}

}
