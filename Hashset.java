package haslistdemo;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("cherry");
		set.add("banana");
		set.add("null");
		set.add("almond");
		
		System.out.println("Size: "+set.size());
		System.out.println(set);
		
		System.out.println("Contains "+set.contains("cherry"));
		set.remove(null);
		System.out.println(set);
		
		 
		for(String s:set)
	 		{
	 			System.out.println(s);
	 		}
	 		
	 		//iterate using iterator	
	 		Iterator<String> itr=set.iterator();
	 		
	 		while(itr.hasNext())
	 		{
	 			System.out.println(itr.next());
	 		}
	 	
			
	 	}
		

	}


