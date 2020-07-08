package javaAtoZ;

public class StrinhgBuffer {
	
	
	
	public void Mystring()
	{
		
		String newstring = "Is that strin immutable ?";
		System.out.println(newstring.concat("-- Yes"));			
		System.out.println(newstring);			
	}
	
	public void Mystringbuff()
	{
		
		StringBuffer newstrbuf = new StringBuffer("Is that strbuff is Mutable");
		System.out.println(newstrbuf.reverse());
		System.out.println(newstrbuf);		
	}	
	
	
	public static void main(String[] args) 
	{
		StrinhgBuffer obj = new StrinhgBuffer();
		
		obj.Mystring();
		obj.Mystringbuff();	
				
		
		//StringBuffer test = new StringBuffer("ilovechennai");				
		//System.out.println(test.charAt(1));
		//System.out.println(test.append("But"));
		//System.out.println(test.insert(12, "But i like TNJ"));
		//System.out.println(test.replace(5,12,"Thanjavur"));
		//System.out.println(test.delete(0,5));		
		//System.out.println(test.reverse());	
		//System.out.println(test.capacity());
	}
}