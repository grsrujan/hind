package add;
import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		
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
	      
	   // remove using values
	      
	      hs.remove(3);
	      System.out.println("hash set after removing element "+hs);
	      
	   // remove using index
	      hs.remove("c");
	      System.out.println("hash set after removing element "+hs);  
	    // remove everything 
	      hs.clear();
	      System.out.println("hash set after removing everything "+hs);

	}

}

/*
output :

[null, a, b, c, d, e]
hash set after removing element [null, a, b, c, d, e]
hash set after removing element [null, a, b, d, e]
hash set after removing everything []




*/
