//A program to implement ragged arrays
import java.util.*;
public class Driver1
{
	public static void main(String args[])
	{
		int arr[][] = new int[3][];
		arr[0] = new int[5];
		arr[1] = new int[3];
		arr[2] = new int[2];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter ["+i+"]["+j+"] Element:");
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
	}
}
