//Emmanuel Jojy
//Roll no.: 53
//S3 CSE A

//Problem 1.
//Write a program to calculate simple interest

class P13_SI
{
	public static void main(String[] args)
	{
		double si, p = 10000, rate = 12.50, time_year = 2;
		si = (p * rate * time_year) / 100;
		System.out.println("\nSimple Interest = "+si);
	}
}
