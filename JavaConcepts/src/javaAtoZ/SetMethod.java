package javaAtoZ;

import java.util.*;

public class SetMethod 


{  
public static void main(String args[]){
	
	Set <String> value = new HashSet<String>();
	
	value.add("Ravi"); 
	value.add("Vijay");  
	value.add("Ravi");  
	value.add("Ajay");
	value.add("Ravi"); 
	value.add("Ravi"); 
	
	for (String test : value) {
		System.out.println(test);		
	} 
	}
	}
	
	
