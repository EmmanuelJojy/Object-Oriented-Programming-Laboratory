public class P11_Search
{
	public static void main(String[] args)
	{
		int a[] = {1, 50, -20, 25, 58};
		int ele = 25, i, flag = 0;
		System.out.print("Elements in array: ");
		for(i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + "  ");
		}
		for(i = 0; i < 5; i++)
		{
			if(a[i] == ele)
			{
				System.out.println("\n\n" + ele + " found at index " + i);
				flag = 1;
			}
		}
		if(flag == 0)
		{
			System.out.println("\nNot found");
		}
	}
}
