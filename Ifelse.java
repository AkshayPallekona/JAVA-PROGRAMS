import java.io.*;
import java.util.Scanner;
public class Ifelse
{
	public static void main(String args[])
	{
 		Scanner scan=new Scanner(System.in);
 		System.out.println("Enter age:");
 		int age=scan.nextInt();
		 if(age>=18)
		 {
 			System.out.println("Eligible to Vote");
 		}
		 else
 		{
 			System.out.println("Not Eligible to Vote");
 		}
 	}
 }
