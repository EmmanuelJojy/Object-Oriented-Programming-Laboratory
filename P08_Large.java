public class P8_Large
{
	public static void main(String[] args)
	{
		int a[] = {9, 1, 20, 0, -1};
		int s = a[0], l = a[0];
		System.out.print("Elements: ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + "  ");
			if(s > a[i])
			{
				s = a[i];
			}
			if(l < a[i])
			{
				l = a[i];
			}
		}
		System.out.println("\nSmallest: " + s);
		System.out.println("Largest: " + l);
	}
}
