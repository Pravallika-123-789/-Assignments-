package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(1, "anurag");
		map.put(2, "arivind");
		map.put(5, "test");
		map.put(null,null);
		map.put(null, "supritha");
		map.put(8, null);
		
		System.out.println(map);
		System.out.println("get element "+map.get(5));
		map.remove(8);
		System.out.println(map);
		
		//iterate using for loop
		for(Map.Entry m :map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}


}
