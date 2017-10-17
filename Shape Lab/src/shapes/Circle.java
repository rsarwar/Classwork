package shapes;

public class Circle implements Shape{

	private double radius;
	private static double pi = 3.14;
	public Circle(double rad)
	{
		this.radius = rad;
	}
	public double area()
	{
		return (pi * (rad * rad));
	}
	public double perimeter()
	{
		return (2 * pi * rad);
	}
}