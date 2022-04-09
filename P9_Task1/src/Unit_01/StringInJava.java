package Unit_01;

public class StringInJava 
{

	public static void main(String[] args) 
	{
		StringInJava obj = new StringInJava();
		
	}





	void StringDefinition()
	{
		String s = "Hello There";
		String s1 = new String("hgjhgjf");
		
		String fourth = "Chandra";
		String fifth = new String ("Prabha");
	}
	
	


void charAndString ()
{
	char[] ch = {'H' , 'e' , 'l' , 'l' , 'o'};
	char[] ch2 = {'!' , '!'};
	
	String s1 = new String(ch);
	System.out.println(s1);
	
	String s2 = "GEEKS";
	char[] ch4 = s2.toCharArray();
	
	char[] a2 = {'A' , 'K' };
	String s3 = new String(a2);
}
}