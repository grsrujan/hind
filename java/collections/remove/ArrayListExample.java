package remove;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
			  
	// Initialize an arrayList using add
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		al.add("f");
		al.add("g");
		al.add("h");
		System.out.println("ArrayList before remove:"+al);
		
		// remove using index
		
		al.remove(0);
		al.remove(1);
		al.remove(1);
		
		System.out.println("ArrayList after remove:"+al);
		
		// remove using values
		
		al.remove("b");
		al.remove("h");
		
		System.out.println("ArrayList after remove:"+al);
		
		// remove everything from array list
		
		al.clear();
		
		System.out.println("ArrayList after removing everything :"+al);

	}
}

/*

output:

ArrayList before remove:[a, b, c, d, e, f, g, h]
ArrayList after remove:[b, e, f, g, h]
ArrayList after remove:[e, f, g]
ArrayList after removing everything :[]

*/

