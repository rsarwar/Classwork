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
		return (pi * (radius * radius));
	}
	public double perimeter()
	{
		return (2 * pi * radius);
	}
	@Override
	public String toString() {
		return "Circle Radius: " + radius + " Area: " + this.area() + " Perimeter: "
				+ this.perimeter();
	}
}
