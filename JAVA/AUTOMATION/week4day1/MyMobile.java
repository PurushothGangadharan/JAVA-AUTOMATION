package week4day1;

import java.util.ArrayList;
import java.util.List;

public abstract class MyMobile {
public static void main(String[] args) {
	
     //AndroidDesign design=new AndroidDesign();
	
	Samsung sam =new  Samsung();
	sam.startPhone();
	sam.makeCall();
	sam.faceAuthendication();
	sam.samsungGalaxy();
	sam.samsungNote();
	sam.sendSms();
	
    AndroidDesign  design=new Samsung();
	//List<String> obj=new ArrayList<String>();
	
	design.startPhone();
	design.makeCall();
	
	SamsungDesign obj=new Samsung();
	obj.faceAuthendication();
	obj.samsungGalaxy();
	
}
}
