class Box
{
	int l, b, h;
	Box()
	{
		l = 10;
		b = 10;
		h = 10;
	}
	Box(int length, int breadth, int height)
	{
		l = length;
		b = breadth;
		h = height;
	}
	void volume()
	{
		System.out.println("Volume of box ["+l+" "+b+" "+h+"] = " + l*b*h);
	}
}
class P17_Sample
{
	public static void main(String[] args)
	{
		Box obj1 = new Box();
		Box obj2 = new Box(1, 2, 3);
		obj1.volume();
		obj2.volume();
	}
}
