package week4day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
	List<String> val=new ArrayList<String>();
	
	val.add("");
	val.add("");
	val.add(1, "");
	val.add("");
	val.add("");
	val.add("");
	val.add( "");
	System.out.println(val);
	
	int size = val.size();
	System.out.println(size);
	
for (String string : val) {
	System.out.println(string);
}
	
	
//	boolean contains = val.contains("");
//	System.out.println(contains);
//	
//   String remove = val.remove(0);
//   
//   System.out.println(remove);
//   
//   val.removeAll(val);
//   System.out.println(val); 
//   
//   boolean empty = val.isEmpty();
//   System.out.println(empty);
   
//	String string = val.get(4);
//	System.out.println(string);
	
	
}
}
