//Emmanuel Jojy
//Roll no.: 53
//S3 CSE A

//Problem 3.
//Write a program to calculate sum of diagonals.

class P15_Sum_Diag
{
	public static void main(String[] args)
	{
		int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int i, j, sum = 0;
		System.out.println("\nArray elements:");
		for(i = 0; i < 3; i++)
		{
			for(j = 0; j < 3; j++)
			{
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		for(i = 0; i < 3; i++)
		{
			sum = sum + arr[i][i];
		}
		System.out.println("\nSum of Main Diagonal: " + sum);
		sum = 0;
		for(i = 0; i < 3; i++)
		{
			j = 3 - i - 1;
			sum = sum + arr[i][j];
		}
		System.out.println("Sum of Off  Diagonal: " + sum);
	}
}
