package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {

		
	// Initialize an arrayList using Arrays.asList
		ArrayList<String> al = new ArrayList<String>(
				Arrays.asList("a", "b", "c","d","e","f"));
			  System.out.println("Elements are:"+al);
			  
	// Initialize an arrayList using add
		ArrayList<String> bl = new ArrayList<String>();
		
		bl.add("a");
		bl.add("b");
		bl.add("c");
		bl.add("d");
		System.out.println("Elements are:"+bl);
		 
	  // Sorting elements of array list in ascending order
	     Collections.sort(al);
	     System.out.println("ArrayList in ascending order:");
	     for(String counter: al){
				System.out.println(counter);
			}
	     
	  // Sorting elements of array list in ascending order
	     Collections.sort(al, Collections.reverseOrder());
	     System.out.println("ArrayList in descending order:");
	     for(String counter: al){
				System.out.println(counter);
			}	  
	      }
		
	}
