//Emmanuel Jojy
//Roll no.: 53
//S3 CSE A

//Problem 2.
//Write a program to sort an array of 7 elements.

public class P14_Sort7
{
	public static void main(String[] args)
	{
		int a[] = {1, 25, -6, 70, 38, 7, 50};
		int i, j, temp;
		System.out.print("\nBefore sort: ");
		for(i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + "  ");
		}
		for(i = 0; i < a.length - 1; i++)
		{
			for(j = 0; j < a.length - i - 1; j++)
			{
				if(a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.print("\nAfter  sort: ");
		for(i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + "  ");
		}
		System.out.println("");
	}
}
