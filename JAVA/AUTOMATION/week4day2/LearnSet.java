package week4day2;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
	Set<String> name=new HashSet<String>();
	//Set<String> name=new TreeSet<String>();
	//Set<String> name=new LinkedHashSet<String>();
	name.add("");
	name.add("");
	boolean add = name.add("");
	System.out.println(add);
	name.add("");
	name.add("");
	name.add("");
	boolean add2 = name.add("");
	System.out.println(add2);
	
	
	System.out.println(name);
}
}
