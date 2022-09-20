class P12_MatrixTrans
{
	public static void main(String args[])
	{
		int i,j;
		int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int b[][] = new int[3][3];
		System.out.println("Matrix A: ");
		for(i = 0; i < 3; i++)
		{
			for(j = 0; j < 3; j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Transpose A: ");
		for(j = 0; j < 3; j++)
		{
			for(i = 0; i < 3; i++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
