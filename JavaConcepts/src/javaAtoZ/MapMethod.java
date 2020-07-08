package javaAtoZ;

import java.util.HashMap;
import java.util.Map;

public class MapMethod {

	public static void main(String[] args) {

		Map <Integer , String> value = new HashMap<>();
		
		value.put(1,"karthik");
		value.put(2,"ravi");
		value.put(3,"ajai");
		value.put(4,"karthik");
		value.put(100,"veera");
		
	System.out.println(value);
	
	System.out.println(value.keySet());
	
	System.out.println(value.values());
	
	System.out.println(value.entrySet());
	
	System.out.println(value.containsKey(8));
	
	System.out.println(value.containsValue("veera"));
	
	value.put(4, "ganesh");
	
	System.out.println(value.values());
	
	
	}
	
	}
