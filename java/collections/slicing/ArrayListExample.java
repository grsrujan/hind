package slicing;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
			  
	// Initialize an arrayList using add
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("a");
		al.add("b");
		al.add("g");
		al.add("c");
		al.add("d");
		al.add("e");
		al.add("f");
		al.add("g");
		al.add("h");
		System.out.println("original list:"+al);
		
		 ArrayList<String> bl = new ArrayList<String>(al.subList(1, 4));
		 
		 System.out.println("SubList stored in ArrayList: "+bl);

	     //Sublist to List
	     List<String> list = al.subList(1, 4);
	     System.out.println("SubList stored in List: "+list);
	     
	     // get an element from the list
	     
	     System.out.println("First element of the ArrayList: "+al.get(0));
	     System.out.println("Second element of the ArrayList: "+al.get(1));
		
	     // first occurrence in a list
	     
	     System.out.println("Last occurrence of element g: "+al.indexOf("g"));
	     
	     // last occurrence in a list
	     
	     System.out.println("Last occurrence of element g: "+al.lastIndexOf("g"));
	     
	     // check if element is present in the list
	     
	     System.out.println("checking if 'a' is present in arraylist: "+al.contains("a"));
	     System.out.println("checking if 'z' is present in arraylist: "+al.contains("z"));
	     
	}
}

/*

output:

original list:[a, b, g, c, d, e, f, g, h]
SubList stored in ArrayList: [b, g, c]
SubList stored in List: [b, g, c]
First element of the ArrayList: a
Second element of the ArrayList: b
Last occurrence of element g: 2
Last occurrence of element g: 7
checking if 'a' is present in arraylist: true
checking if 'z' is present in arraylist: false

*/
