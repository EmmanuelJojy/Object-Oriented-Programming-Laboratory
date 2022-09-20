public class P9_Sort
{
	public static void main(String[] args)
	{
		int a[] = {1, 25, -6, 70, 38};
		int i, j, temp;
		System.out.print("Before sort: ");
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
		System.out.print("\nAfter sort: ");
		for(i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + "  ");
		}
		System.out.println("");
	}
}
