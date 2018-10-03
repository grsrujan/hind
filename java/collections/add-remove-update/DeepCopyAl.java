package convertion;

import java.util.ArrayList;
import java.util.Iterator;

public class DeepCopyAl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<String> rawList = new ArrayList<String>();
		
		rawList.add("a");
		rawList.add("c");
		rawList.add("b");
		rawList.add("d");
		System.out.println("Elements of raw list are: "+rawList);
		    
    // deep copy arraylist
		ArrayList<String> al = new ArrayList<String>();		
		for (String i :rawList){
			al.add(new String(i));
		}
    
    System.out.println("Elements of new list are: "+al);
		
	}

}
