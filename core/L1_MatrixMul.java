// Emmanuel Jojy 
// S3 CSE A
// Roll no: 53

// Program: 1
// Matrix Multiplication

public class L1_MatrixMul
{
	public static void main(String args[])
	{
		int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int b[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int c[][] = new int[3][3];
		int i, j, k;
		System.out.println("Matrix A: ");
		for(i = 0; i < 3; i++)
		{
			for(j = 0; j < 3; j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Matrix B: ");
		for(i = 0; i < 3; i++)
		{
			for(j = 0; j < 3; j++)
			{
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("A x B: ");
		for (i = 0; i < 3; i++)
		{ 
			for (j = 0; j < 3; j++)
			{ 
				for (k = 0; k < 3; k++) 
				{
					c[i][j] = c[i][j] + (a[i][k] * b[k][j]); 
				}
			}
		}
		for(i = 0; i < 3; i++)
		{
			for(j = 0; j < 3; j++)
			{
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
