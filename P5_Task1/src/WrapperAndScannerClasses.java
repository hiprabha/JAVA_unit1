import java.util.Scanner;

public class WrapperAndScannerClasses 
{

	public static void main(String[] args) 
	{
		int a = 20;
		
		String s = "" + a + "";
		
		Integer i = Integer.valueOf(a);
		Integer j = a;
		
		System.out.println(a + " " + i + " " + j);
		System.out.println(i.toString());
		
		byte b = 10;
		Byte byteobj = b;
		
		System.out.println(byteobj);
		
		byte bytevalue = byteobj;
		
		System.out.println(bytevalue);
		
		//Scanner object in Java
		
		Scanner myObj1 = new Scanner(System.in);
		Scanner myObj2 = new Scanner(System.in);
		
		String firstName = myObj1.next();
		System.out.println("Name is : " + firstName + "\n");
		
		String name = myObj2.nextLine();
		String name2 = myObj2.nextLine();
		
		System.out.println("Name is : " + name + "\n");
		System.out.println("Name is : " + name2 + "\n");
		
		boolean c = myObj2.nextBoolean();
		System.out.println(c + "\n");
		
		myObj1.close();
		myObj2.close();
		
	}

}
