package program;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> demo = new HashMap<Integer, String>();
		
		demo.put(1, "a");
		demo.put(3152, "Suraj");
		demo.put(12, "abc");
		demo.put(10, "Name");
		demo.put(10, "XYZ");
		for(Map.Entry<Integer, String> d : demo.entrySet())
		{
			System.out.println(d.getKey() + " "+ d.getValue());
			
		}
		
	
	
	}

}
