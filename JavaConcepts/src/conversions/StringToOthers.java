package conversions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class StringToOthers {
	
	
	public void  StringToInteger()
	{String str = "2147483647";
	int inum = Integer.parseInt(str);   //return primitive
	System.out.println(inum);

	Integer onum = Integer.valueOf(str); //return object
	System.out.println(onum);	}
	
	
	public static void StringToChar()
    {String str = "StringToCharacter"; 
     char[] ch = str.toCharArray();  
     for (char c : ch) { 
     System.out.println(c); }}
	
	  public void StringToLong()  
	  { String longStr = "1456755";
	  long ilong = Long.parseLong(longStr); //return primitive
	  System.out.println(ilong);
	  
	  Long olong = Long.valueOf(longStr); //return object
	  System.out.println(olong); }
	 
	
	  public void StringToFloat()
	  { String floatStr = "49.78";
	  
	  float ifloat = Float.parseFloat(floatStr); //return primitive
	  System.out.println(ifloat);
	  
	  Float ofloat = Float.valueOf(floatStr); //return object
	  System.out.println(ofloat); }
	  
	  public void StringToDouble() 
	  { String doubleStr = "99.378";
	  
	  double idouble = Double.parseDouble(doubleStr); //return primitive
	  System.out.println(idouble);
	  
	  Double odouble = Double.valueOf(doubleStr); //return object
	  System.out.println(odouble); }
	  
	  public void StringToBoolean() 
	  { String trueStr = "true"; 
	  String falseStr = "false"; 
	  String randomStr = "java";
	  
	  System.out.println(Boolean.parseBoolean(trueStr)); //true
	  System.out.println(Boolean.valueOf(falseStr)); //false
	  System.out.println(Boolean.parseBoolean(randomStr)); //false }
	  
	  }
	  public void StringToDate() throws ParseException 
	  { String dateStr = "10/03/2019";
	  
	  SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
	  Date dateObj = format.parse(dateStr);
	  System.out.println(dateObj); }
	 
	
	
	public static void main(String[] args) throws ParseException  
	
	{
		// TODO Auto-generated method stub
		
		StringToOthers obj = new StringToOthers();
		
		  obj.StringToInteger();
		  obj.StringToChar();
		  obj.StringToLong(); 
		  obj.StringToFloat();
		  obj.StringToDouble();
		  obj.StringToBoolean();
		  obj.StringToDate();
		 

	}

}
