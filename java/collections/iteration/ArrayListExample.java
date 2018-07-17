package iteration;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
			  
	// Initialize an arrayList using add
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		System.out.println("Elements are:"+al);
		
	// Iterate elements using for loop
		System.out.println("Using For Loop");
		for (int counter = 0; counter < al.size(); counter++) { 		      
	          System.out.println(al.get(counter)); 		
	      } 
		
	// Iterate elements using Advanced for loop
		System.out.println("Using advanced For Loop");
		for (String a : al) { 		      
	           System.out.println(a); 		
	      }
		
	// Iterate elements using while loop
		System.out.println("Using While Loop");
		int cnt = 0; 		
	    while (al.size() > cnt) {
		 System.out.println(al.get(cnt));
	         cnt++;
	      }
	// Iterate elements using for Iterator
	    System.out.println("Using Iterator"); 
	    Iterator<String> iter = al.iterator();
	     while (iter.hasNext()) {
	         System.out.println(iter.next());
	     }
	 //  Iterate elements using enumeration
	     System.out.println("Using Enumeration");
	         Enumeration<String> e = Collections.enumeration(al);
	         while(e.hasMoreElements()){
	             System.out.println(e.nextElement());
	         }
	
			  
	      }
		
	}
