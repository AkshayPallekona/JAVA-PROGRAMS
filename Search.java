import java.io.*;
import java.util.*;
public class Search
{
	public static void main(String args[])
	{
		int arr[]=new int[100];
		int res=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no.of values:");
		int n=scan.nextInt();
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enetr Element to search : ");
		int value = scan.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==value)
			{
				System.out.println("Element Found at index :"+ i);
				System.out.println("Element is at Position :"+ (i+1));
				res=1;
				break;
			}
		}
		if(res==0)
			System.out.println("Enter valid search element");
	}
}	
		
