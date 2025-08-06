//A program to implement BINARY SEARCH
import java.util.*;
public class BinarySearch
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = scan.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter "+(i+1)+ " Element :");
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter element to search :");
		int n = scan.nextInt();
		int len = arr.length;
		int low = 0;
		int high = len-1;
		int mid = (low+high)/2;
		boolean found = true;
		while(found)
		{
			if(n == arr[mid])
			{
				System.out.println("Element found at index: "+mid);
				System.out.println("Element is at position : "+(mid+1));
				found = false;
			}
			else if(n>arr[mid])
			{
				low=mid+1;
				mid=(low+high)/2;
			}
			else if(n<arr[mid])
			{
				high=mid-1;
				mid=(low+high)/2;
			}
			else
				System.out.println("Enter Valid Element to Search");
		}
	}
}
