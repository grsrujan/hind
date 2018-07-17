package Listcheck;
import java.util.*;

public class LinkedListCheck {

	public static void main(String[] args) {
		
		LinkedHashSet<String> al=new LinkedHashSet<String>();
		
		al.add("g");
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		
		LinkedHashSet<String> bl=new LinkedHashSet<String>();
		
		bl.add("a");
		bl.add("b");
		bl.add("d");
		bl.add("c");
		bl.add("e");
		bl.add("f");
		bl.add("g");
		
		int newCount = bl.size();

		StringBuilder schema = new StringBuilder();
		StringBuilder sel = new StringBuilder();

		schema.append("CREATE TABLE test (");
		sel.append("INSERT INTO TABLE test \nSELECT\n");
		   int i=0;
			for (String b:bl){
				if(al.contains(b) && i++ != (bl.size()-1)){
					schema.append(b+" string ,\n");
					sel.append(b+ " ,\n");
				}
				else if (i++ == bl.size()-1)
				{
					System.out.println(i);
					schema.append(b+" string \n");
					sel.append("null as "+b+ " \n");
				}
				else if (i++ != bl.size()-1)
					{
						schema.append(b+" string ,\n");
						sel.append("null as "+b+ " ,\n");
					}				
				}

        schema.append(") STORED AS TEXTFILE;");
        sel.append("FROM test1;");
        System.out.println(schema);
        System.out.println("  ");
        System.out.println(sel);     
	}

}
