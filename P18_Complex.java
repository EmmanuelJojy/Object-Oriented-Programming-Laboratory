class Number
{
	int i,r;
	Number()
	{
		i = 0;
		r = 0;
	}
	Number(int i, int r)
	{
		this.i = i;
		this.r = r;
	}
	public Number add(Number n)
	{
		Number res = new Number();
		res.i = this.i + n.i;
		res.r = this.r + n.r;
		return res;
	}
	public String display()
	{
		System.out.print("("+this.r+" + i"+this.i+")");
		return "";
	}
}
class P18_Complex
{
	public static void main(String[] args)
	{
		Number c1 = new Number(1,2);
		Number c2 = new Number(3,4);
		c1.display();
		System.out.print(" + ");
		c2.display();
		System.out.print(" = ");
		c1.add(c2).display();
		System.out.println();
	}
}
