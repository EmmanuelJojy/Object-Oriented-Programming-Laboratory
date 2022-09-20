class Figure
{
	int x, y;
	Figure(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	double area()
	{
		System.out.println("Area not defined");
		return 0;
	}
}
class Rectangle extends Figure
{
	Rectangle(int x, int y)
	{
		super(x, y);
	}
	double area()
	{
		return (x*y);
	}
}
class Triangle extends Figure
{
	Triangle(int x, int y)
	{
		super(x, y);
	}
	double area()
	{
		return ((x * y) / 2);
	}
}
class P19_Override
{
	public static void main(String[] args)
	{
		Figure f = new Figure(10, 10);
		Rectangle r = new Rectangle(10, 10);
		Triangle t = new Triangle(10, 10);
		Figure ref;
		ref = f;
		System.out.println("Figure Area = " + ref.area());
		ref = r;
		System.out.println("Rectangle Area = " + ref.area());
		ref = t;
		System.out.println("Triangle Area = " + ref.area());
	}
}
