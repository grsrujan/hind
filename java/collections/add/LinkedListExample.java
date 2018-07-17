package add;
import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a LinkedList
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
	     
	     // adding elements at specific index
	     ll.add(3,"z");
	     System.out.println("LinkedList after adding element: "+ll);
	     
	     // adding element at the beginning
	     ll.addFirst("d");
	     System.out.println("LinkedList after adding element: "+ll);
	     
	     // adding element at the last
	     
	    ll.addLast("x");
	     System.out.println("LinkedList after adding element: "+ll);
		
	     LinkedList<String> la = new LinkedList<String>();
	     
	     //copy one list to other
	     
	     la.addAll(ll);
	     System.out.println(la);

	}

}

/*

output:
LinkedList elements: [a, b, c, d, e, f, g, a]
LinkedList after adding element: [a, b, c, z, d, e, f, g, a]
LinkedList after adding element: [d, a, b, c, z, d, e, f, g, a]
LinkedList after adding element: [d, a, b, c, z, d, e, f, g, a, x]
[d, a, b, c, z, d, e, f, g, a, x]
*/
