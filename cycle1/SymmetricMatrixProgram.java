import java.util.Scanner;
public class SymmetricMatrixProgram
{
	public static void main(String[] args)
	{
		System.out.println("Merin Magi Telson");
		System.out.println("23MCA043");
		System.out.println("13/02/2024");
		System.out.println("Symmetric Matrix Program");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows=s.nextInt();
		System.out.println("Enter the number of columns:");
		int cols=s.nextInt();
		int matrix[][]=new int[rows][cols];
		System.out.println("Enter the elements of the matrix:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix[i][j]=s.nextInt();
			}
		}
		s.close();
		System.out.println("Printing the input Matrix:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		if(rows !=cols)
			System.out.println("The given matrix is not a square matrix");
		else
		{
			boolean symmetric=true;
			for(int i=0;i<rows;i++)
				for(int j=0;j<cols;j++)
				if(matrix[i][j] !=matrix[j][i])
				{
					symmetric=false;
					break;
				}
						
			if(symmetric)
			{
				System.out.println("the given matrix is symmetric....");
			}
			else
			{
				System.out.println("The given matrix is not symmetric..");
			}
		}
	}
}
		
						
					

