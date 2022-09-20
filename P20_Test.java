class A
{
	void read(int a)
	{
		System.out.println("No return type.");
	}
	double read(int a)
	{
		System.out.println("With return type.");
		return a*a;
	}
}
class P20_Test
{
	public static void main(String[] args)
	{
		A obj = new A();
		obj.read(7);
		double d = obj.read(7);
	}
}
