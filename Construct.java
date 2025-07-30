import java.io.*;
public class Construct						
{
	int a;								// a and b are variables
	Construct()                                                  
	{
		a=5;
		System.out.println("A = "+a);
	}
	Construct(int c)
	{
		System.out.println("Entered = "+c);
	}
	
	public static void main(String args[])
	{
		Construct obj = new Construct();
		Construct obj1 = new Construct(6);
	}
}
