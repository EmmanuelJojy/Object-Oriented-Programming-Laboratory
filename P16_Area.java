class Shape
{
	void area(int r)
	{
		System.out.println("Area of circle of radius "+r+" is: "+(3.14*r*r));
	}
	void area(int l, int b)
	{
		System.out.println("Area of rectangle of sides "+l+" and "+b+" is: "+(l*b));
	}
	void area(int a, int b, int c)
	{
		double s = (a+b+c)/2;
		double res = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of rectangle of sides "+a+", "+b+" and "+c+" is: "+res);
	}
}
class P16_Area
{
	public static void main(String[] args)
	{
		Shape obj = new Shape();
		obj.area(3);
		obj.area(6, 7);
		obj.area(3, 4, 5);
	}
}
