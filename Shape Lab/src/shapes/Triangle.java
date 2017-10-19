package shapes;

public class Triangle implements Shape{
	private double base;
	private double side2;
	private double side3;
	private double height;
	
	public Triangle(double base, double side2, double side3, double height)
	{
		this.base = base;
		this.side2 = side2;
		this.side3 = side3;
		this.height = height;
	}
	public double area()
	{
		return ((1/2)*base*height);
	}
	public double perimeter()
	{
		return (base + side2 + side3);
	}

}
