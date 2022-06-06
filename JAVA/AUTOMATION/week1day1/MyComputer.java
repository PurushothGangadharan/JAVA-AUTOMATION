package week1day1;

public class MyComputer {

	public static void main(String[] args) {
    Computer object=new Computer();
    
    String computerName=object.computerName;
    
    int memory=object.memory;
    
    System.out.println(object.isDamaged);
    
    char firstLetter='D'; 
    System.out.println(computerName);
	System.out.println(firstLetter);
	System.out.println(memory);
	}

}
