package conversions;

public class IntegerToOthers {
	
	
	
	  public void IntegerToString() 
	  {int integer= 145214; 
	  String str = String.valueOf(integer); System.out.println(str);
	  String str1 = Integer.toString(integer); System.out.println(str1); }
	 
	  
	  public void strBuffer()
	  { int f = 1234; 
	    StringBuffer sb = new StringBuffer(); 
	    sb.append(f); 
	    String str6 = sb.toString(); 
	    System.out.println("String str6 = " + str6);} 
	  
	  public void InterToChar()
	  {	  int i =  68;
		  char ch = (char)i;
		  System.out.println(ch);}
	  

	  public void IntegerToLong()
	  {
		  int integer= 145214;
		  Long lng = Long.valueOf(integer); System.out.println(lng);
	  }
	  
	  
	  public void IntegerToDouble()
	  {
		  int integer= 145214;
		  Double dble = Double.valueOf(integer); System.out.println(dble);
	  }
	  
	public static void main(String[] args) 
	{
		IntegerToOthers  obj = new IntegerToOthers();
		obj.IntegerToString();
		obj.InterToChar();
		obj.strBuffer();
		obj.IntegerToLong();
		obj.IntegerToDouble();
		
		
	}
}
