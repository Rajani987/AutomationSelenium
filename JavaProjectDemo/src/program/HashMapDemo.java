package program;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 100);
		map.put("Lekha", 100);
		
		// for each 
		//for(int i=0;i<10;i++)
		for(Map.Entry<String, Integer> a : map.entrySet())
		{
			System.out.println("Key = " + a.getKey() + " Value = " +a.getValue());
		}
			
		
	}

}
