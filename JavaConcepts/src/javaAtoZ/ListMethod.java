package javaAtoZ;


import java.util.LinkedList;

public class ListMethod {

	public static void main(String[] args) {

		
		LinkedList<String> list = new LinkedList<String>();
		
		
		list.add("Ravi");  
		list.add("Vjay");  
		list.add("Ravi");  
		list.add("Ajay"); 
		list.add("Ravi");
		list.add("Ravi");


		for (String test : list) 
		{
			//System.out.println(test);
			
		System.out.println(test.concat("   Karthik"));
			
		} 

	}

}
