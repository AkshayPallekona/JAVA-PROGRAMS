import java.io.*;
import java.util.Scanner;
public class Switch
{
 	public static void main(String args[])
	{	
		Scanner scan=new Scanner(System.in);
 		System.out.println("Enter a Value from 1 to 5:");
 		int value=scan.nextInt();
 		switch(value)
 		{
 			case 1:
 				System.out.println("You Entered ONE");
 				break;
 			case 2:
 				System.out.println("You Entered TWO");
 				break;
 			case 3:
 				System.out.println("You Entered THREE");
 				break;
 			case 4:
 				System.out.println("You Entered FOUR");
 				break;
 			case 5:
 				System.out.println("You Entered FIVE");
 				break;
 			default :
 				System.out.println("Entered Invalid");
 		}
 	}
 }
