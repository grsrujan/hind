package search;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     LinkedList<String> ll = new LinkedList<String>();
	     
	     ll.add("a");
	     ll.add("b");
	     ll.add("c");
	     ll.add("d");
	     ll.add("e");
	     ll.add("f");
	     ll.add("g");
	     ll.add("a");
	     
	     System.out.println("LinkedList elements: "+ll);
	  // Getting first element of the List
	     Object firstElement = ll.getFirst();
	     System.out.println("First Element is: "+firstElement);
	  
	     // Getting Last element of the List
	     Object lastElement = ll.getLast();
	     System.out.println("Last Element is: "+lastElement);
	     
	     //get element from specific index
	     System.out.println("Element at index 4 is "+ll.get(4));
	     
	   //Searching first occurrence of element
	     int firstIndex = ll.indexOf("a");
	     System.out.println("First Occurrence: " + firstIndex);
	 
	     //Searching last occurrence of element
	     int lastIndex = ll.lastIndexOf("a");
	     System.out.println("Last Occurrence: " + lastIndex);
	     
	     // Obtaining Sublist from the LinkedList
	     List sublist = ll.subList(2,5);
	     
	     System.out.println("sublist: " + sublist);

	}

}

/*

output:
LinkedList elements: [a, b, c, d, e, f, g, a]
First Element is: a
Last Element is: a
Element at index 4 is e
First Occurrence: 0
Last Occurrence: 7
sublist: [c, d, e]



*/
