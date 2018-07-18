package add;

import java.util.Arrays;
import java.util.*;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		// Initialize an hashSet using Arrays.asList
		LinkedHashSet<String> al = new LinkedHashSet<String>(
				Arrays.asList("a", "b", "c","d","e","f"));
			  System.out.println("Elements are:"+al);
		
		// Initialize an hashSet using add
			  
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		
	     hs.add("a");
	      hs.add("b");
	      hs.add("c");
	      hs.add("d");
	      hs.add("e");
	      //Addition of duplicate elements
	      hs.add("a");
	      hs.add("b");
	      //Addition of null values
	      hs.add(null);
	      hs.add(null);
	      System.out.println(hs);
	      
	      LinkedHashSet<String> hs1 = new LinkedHashSet<String>();
	      hs1.add("z");
	      hs1.add("b");
	   // union operation using addAll
	      
	      hs1.addAll(hs);
	      System.out.println("union "+hs1);
	      
	   // difference operation
	      
	      hs1.removeAll(hs);
	      System.out.println("Difference "+hs1);
	      
	   // intersect operation
	      hs1.retainAll(hs);
	      System.out.println("Intersection "+hs1);
	      
	  	      
	   // remove using values
	      
	      hs.remove(3);
	      System.out.println("set after removing element "+hs);
	      
	   // remove using index
	      hs.remove("c");
	      System.out.println("set after removing element "+hs);  
	    // remove everything 
	      hs.clear();
	      System.out.println("set after removing everything "+hs);
	    
	      // check if Set is empty
	      
	      System.out.println(hs.isEmpty());
	}

}



/*

output:

Elements are:[a, b, c, d, e, f]
[a, b, c, d, e, null]
union [z, b, a, c, d, e, null]
Difference [z]
Intersection []
set after removing element [a, b, c, d, e, null]
set after removing element [a, b, d, e, null]
set after removing everything []
true

*/
