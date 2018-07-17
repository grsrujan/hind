package Listcheck;
import java.util.*;

public class LinkedListCheck {

	public static void main(String[] args) {
		
		LinkedList<String> al=new LinkedList<String>();
		
		al.add("a");
		al.add("b");
		al.add("d");
		al.add("c");
		al.add("e");
		al.add("f");
		al.add("g");
		al.add("h");
		//al.add("i");
		int oldCount=al.size();
		System.out.println(oldCount);
		
		LinkedList<String> bl=new LinkedList<String>();
		LinkedList<String> cl=new LinkedList<String>();
		
		bl.add("a");
		bl.add("b");
		bl.add("d");
		bl.add("c");
		bl.add("e");
		bl.add("f");
		bl.add("g");
		
		cl.add("a");
		cl.add("b");
		cl.add("d");
		cl.add("c");
		cl.add("e");
		cl.add("f");
		cl.add("g");
		int newCount=bl.size();
		System.out.println(newCount);
		
		if (al.size() > bl.size()){
		for (int i = 0; i < bl.size(); i++){		
			if (al.get(i).equals(bl.get(i))){				
				cl.remove(bl.get(i));
			}			
		}
		}
		else if (al.size() < bl.size()) {
			for (int i = 0; i < al.size(); i++){		
				if (al.get(i).equals(bl.get(i))){				
					cl.remove(bl.get(i));
				}			
			}	
			
		}
		
		else if (al.size() == bl.size()) {
			for (int i = 0; i < al.size(); i++){		
				if (al.get(i).equals(bl.get(i))){				
					cl.remove(bl.get(i));
				}			
			}	
			
		}
			
		
		System.out.println(cl.size());
		System.out.println(cl);

		StringBuilder schema=new StringBuilder();
		StringBuilder sel=new StringBuilder();

		schema.append("CREATE TABLE test (");
		sel.append("INSERT INTO TABLE test \nSELECT\n");
		
		for (int i = 0; i < bl.size(); i++)
		
		{	
			//if(bl.indexOf(i) == (bl.size() -1));  
		if (al.contains(bl.get(i)) && i != (bl.size() -1)){
			schema.append(bl.get(i)+" string ,\n");
			sel.append(bl.get(i)+ " ,\n");		
		}
		
		else if (!al.contains(bl.get(i)) && i == (bl.size() -1))
		{
			schema.append(bl.get(i)+" string \n");
			sel.append("null as "+bl.get(i)+ " \n");
		}
		else if (al.contains(bl.get(i)) && i == (bl.size() -1))
		{
			schema.append(bl.get(i)+" string \n");
			sel.append(bl.get(i)+ " \n");
		}
		
		else
		{
			schema.append(bl.get(i)+" string ,\n");
			sel.append("null as "+bl.get(i)+ " ,\n");
		}
			/*
			cl.add(bl.get(i));
			dl.add(bl.get(i));
		}
		else
			cl.add("null as "+bl.get(i));
			dl.add(bl.get(i));
			*/
		}
		//System.out.println(cl);
		//System.out.println(dl);
		/*
		Iterator<String> itr = dl.iterator();
        while(itr.hasNext()){
        	schema.append(itr.next()+" string ,\n");       	
        }
        */
        schema.append(") STORED AS TEXTFILE;");
        sel.append("FROM test1;");
        System.out.println(schema);
        System.out.println("");
        System.out.println(sel);
        
	}

}
