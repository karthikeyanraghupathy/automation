package basicPrograms;

public class ReverseString {

	
	public void  strbuffer()
	{
		
            String input = "String Buffer Method"; 	  
	        StringBuffer input1 = new StringBuffer("String Buffer Method"); 	  
	
	        // append a string into StringBuilder input1 
	        input1.append(input); 
	  
	        // reverse StringBuilder input1 
	        input1 = input1.reverse(); 
	  
	        // print reversed String 
	        System.out.println(input1); 
	    } 
	
	
	public void  forloop()
	{
		   String input = "GeeksforGeeks"; 
	  
	        // getBytes() method to convert string  
	        // into bytes[]. 
	        byte [] strAsByteArray = input.getBytes(); 
	  
	        byte [] result =   new byte [strAsByteArray.length]; 
	  
	        // Store result in reverse order into the 
	        // result byte[] 
	        for (int i = 0; i<strAsByteArray.length; i++) 
	            result[i] =  
	             strAsByteArray[strAsByteArray.length-i-1]; 
	  
	        System.out.println(new String(result));  
	}

	
	public void chararray()  //String to character array
	{
		{ 
	        String input = "GeeksForGeeks"; 
	  
	        // convert String to character array 
	        // by using toCharArray 
	        char[] try1 = input.toCharArray(); 
	  
	        for (int i = try1.length-1; i>=0; i--) 
	        	
	            System.out.print(try1[i]); 
	        
	             System.out.println(try1.length);
	    } 
	}
	
	public static void main(String[] args) 
	{
    
		ReverseString obj = new ReverseString();
		obj.strbuffer();
		obj.forloop();
		obj.chararray();

	}
}
