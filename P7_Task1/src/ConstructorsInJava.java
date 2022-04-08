
public class ConstructorsInJava 
{
	int x;
	int y;
	
	public ConstructorsInJava()       //Default constructor in Java
	{
		x = 10;
	}
	
	public ConstructorsInJava(int a)   //Parameterized constructor in Java
	{
		y = a;
	}
	
	public static void main(String[] args) 
	{
		ConstructorsInJava myObj = new ConstructorsInJava();
		System.out.println(myObj.x);
		
		
		ConstructorsInJava myObj1 = new ConstructorsInJava(50);
		System.out.println(myObj1.y);
	}

}

