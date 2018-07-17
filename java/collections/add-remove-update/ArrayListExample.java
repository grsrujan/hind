package add;
import java.util.*;

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
		
	// add element at particular index
		al.add(0, "z");
		System.out.println("Elements are:"+al);
		
	// add one list to other
		
		al.addAll(bl);
		System.out.println("Elements are:"+al);
		
	// copy one list to other
		ArrayList<String> cl = new ArrayList<String>();
		cl.addAll(bl);
		System.out.println("Elements are:"+cl);
	
	// adding list starting from specified location 
		
		al.addAll(3, bl);
		System.out.println("Elements are:"+al);
		
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

output :
Elements are:[a, b, c, d, e, f]
Elements are:[a, b, c, d]
Elements are:[z, a, b, c, d, e, f]
Elements are:[z, a, b, c, d, e, f, a, b, c, d]
Elements are:[a, b, c, d]
Elements are:[z, a, b, a, b, c, d, c, d, e, f, a, b, c, d]
ArrayList before remove:[z, a, b, a, b, c, d, c, d, e, f, a, b, c, d]
ArrayList after remove:[a, b, c, d, c, d, e, f, a, b, c, d]
ArrayList after remove:[a, c, d, c, d, e, f, a, b, c, d]
ArrayList after removing everything :[]


*/
