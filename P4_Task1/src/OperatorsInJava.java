
public class OperatorsInJava 
{

	public static void main(String[] args) 
	{
		int x=10;  
		System.out.println(x++);    //Java Unary Operators
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);
		
		
		int a=10;  
		int b=5; 
		System.out.println(a+b);     //Java Arithmetic Operators
		System.out.println(a-b); 
		System.out.println(a*b); 
		System.out.println(a/b); 
		System.out.println(a%b); 
		
		
		System.out.println(10<<2);   //Java Left and Right Shift Operator
		System.out.println(15<<4);
		System.out.println(10>>2);
		System.out.println(20>>2);
		
		
		int y=10;                    //Java Assignment Operators
		y+=3;  
		System.out.println(y);  
		y-=4; 
		System.out.println(y);  
		y*=2; 
		System.out.println(y);  
		y/=2;  
		System.out.println(y); 
		
		
		int u = 10;                  //Java Relational Operators
		int v = 20;

		System.out.println(u == v);
		System.out.println(u != v);
		System.out.println(u > v);
		System.out.println(u < v);
		System.out.println(u >= v);
		System.out.println(u <= v);
		
		
		// && operator
	    System.out.println((5 > 3) && (8 > 5));    //Java Logical Operators
	    System.out.println((5 > 3) && (8 < 5)); 

	    // || operator
	    System.out.println((5 < 3) || (8 > 5));  
	    System.out.println((5 > 3) || (8 < 5));  
	    System.out.println((5 < 3) || (8 < 5));  

	    // ! operator
	    System.out.println(!(5 == 3));  
	    System.out.println(!(5 > 3));  
	    
	    
	    int j=2;                           //Java Ternary Operator
	    int k=5;  
	    int min=(j<k)?j:k;  
	    System.out.println(min);  
	    
	    
	    int p = 5;
        int q = 7;
 
        System.out.println("p&q = " + (p & q));     //Java Bitwise Operators
 
        
        System.out.println("p|q = " + (p | q));
 
       
        System.out.println("p^q = " + (p ^ q));
 

	}

}
