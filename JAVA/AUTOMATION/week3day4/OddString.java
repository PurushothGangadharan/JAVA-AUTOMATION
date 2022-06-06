package week3day4;

public class OddString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="welcome";
		char[] array=text.toCharArray();
		System.out.println(array);
		int length=text.length();
		System.out.println(length);
		
		for(int i=0;i<length;i++) {
			if(i%2!=0) {
				System.out.print(Character.toUpperCase(array[i]));
			}
				else
				{
					System.out.print(array[i]);
				}
					
			}
		}
	}
