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

	      }	
	}
