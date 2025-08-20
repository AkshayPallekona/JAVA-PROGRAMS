//program to add matrices
import java.util.*;
public class Matrices

{
	public static void main(String args[])
	
	{
		Scanner sc = new Scanner(System.in);
		int m1,n2;
		System.out.println("Enter no.of rows: ");
		m1 = sc.nextInt();
		System.out.println("Enter no.of columns : ");
		n2 = sc.nextInt();
		int matrix1[][] = new int[m1][n2];
		int matrix2[][] = new int[m1][n2];
		int matrix3[][] = new int[m1][n2];
		System.out.println("Enter Matrix1 Elements : ");
		for(int i = 0;i<m1;i++)
		
		{
			for(int j = 0;j<n2;j++)
			
			{
				matrix1[i][j] = sc.nextInt();
			}
			
		}
		System.out.println("Enter Matrix2 Elements : ");
		for(int i = 0;i<m1;i++)
		
		{
			for(int j = 0;j<n2;j++)
			
			{    
				matrix2[i][j] = sc.nextInt();
			}
			
		}
		for(int i = 0;i<m1;i++)
		
		{
			for(int j = 0;j<n2;j++)
			
			{
				matrix3[i][j] = matrix1[i][j]+matrix2[i][j];
			}
			
		}
		SYstem.out.println();
		for(int i = 0;i<m1;i++)
		
		{
			for(int j = 0;j<n2;j++)
			
			{
				System.out.print(matrix3[i][j]);
				System.out.print("\t");
			}
			System.out.println();
			
		}
		
	}		
}
		
