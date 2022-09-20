//Emmanuel Jojy 
//S3 CSE A
//Roll no.: 53

//Program illustrating Abstract Classes
//Lab Cycle Program

abstract class Shape{
	abstract int numberOfSides();
}
class Rectangle extends Shape{
	int numberOfSides(){
		return 4;
	}
}
class Triangle extends Shape{
	int numberOfSides(){
		return 3;
	}
}
class Hexagon extends Shape{
	int numberOfSides(){
		return 6;
	}
}

public class L3_Abst
{
	public static void main(String[] args)
	{
		Shape ref;
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Hexagon h = new Hexagon();
		System.out.println(r.toString());
		ref = r;
		System.out.println("Rectangle sides: " + ref.numberOfSides());
		ref = t;
		System.out.println("Triangle sides: " + ref.numberOfSides());
		ref = h;
		System.out.println("Hexagon sides: " + ref.numberOfSides());
	}
}
