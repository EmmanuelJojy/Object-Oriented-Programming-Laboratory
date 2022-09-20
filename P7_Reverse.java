public class P7_Reverse
{
	public static void main(String[] args)
	{
		int a = 321, res = 0;
		System.out.println("Before Reverse : " + a);
		while(a != 0)
		{
			res = (res * 10) + (a % 10);
			a = a / 10;
		}
		System.out.println("Reverse number is : " + res);
	}
}
