import java.io.*;
import java.util.*;
public class Overloading
{
	public void add(int a,int b)
	{	
		int c=a+b;
		System.out.println("Sum of "+ a +" and "+ b + ":" +c);
	}
	public void add(int a,int b,int c)
	{	
		int d=a+b+c;
		System.out.println("Sum of " + a + "," +b + "," +c +":" + d);
	}
	public void add(double a,double b)
	{	
		 double  c=a+b;
		System.out.println("Sum of "+ a +" and "+ b + ":" +c);
	}
	public void add(double a,double b,double  c)
	{	
		double d=a+b+c;
		System.out.println("Sum of " + a + "," +b + "," +c +":" + d);
	}
	public static void main(String args[])
	{
		Overloading obj=new Overloading();
		obj.add(5,6);
		obj.add(1.3,2.5);
		obj.add(1,2,34);
		obj.add(1.2,4.5,7.7);
	}
}
