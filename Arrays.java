//A program to implement Arrays
import java.util.*;
public class Arrays
{
	public static void main(String args[])
	{	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+(i+1)+ " Element :");
			arr[i]=scan.nextInt();
		}
		System.out.println("Elemets are : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
