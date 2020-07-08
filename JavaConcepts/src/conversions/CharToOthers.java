package conversions;

public class CharToOthers {
	
	public void chartointer()
	{char c = '%';
	
	System.out.println(c);
	
	Integer i = Integer.valueOf(c);
	System.out.println(i);}
	
	
	public void chartostring()
	{char c = '%';
	String str = String.valueOf(c);
	
	System.out.println(str);}

	public static void main(String[] args) {
		
		CharToOthers obj = new CharToOthers();
		obj.chartointer();	
		obj.chartostring();
	}
}