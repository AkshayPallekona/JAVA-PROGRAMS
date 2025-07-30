import java.io.*;
import java.util.Scanner;
public class Nestedif
{
 	public static void main(String args[])
	{	
 		Scanner scan=new Scanner(System.in);
 		System.out.println("Enter Marks:");
 		int marks=scan.nextInt();
 		if(marks>100 || marks<0) 
 			System.out.println("Invalid Marks");
 			else if(marks>=75 && marks<=100)
 			{
 				System.out.println("Distinction");
 			}
 			else if(marks>=50 && marks<75)
 			{
 				System.out.println("Average");
 			}
 			else if(marks>=35 && marks<50)
 			{
 				System.out.println("Pass");
 			}
 			else
 			{
 				System.out.println("Fail");
 			}
 		
 	}
 }
