package shapes;

public class Rectangle implements Shape {

	private double length;
	private double width;
	
	public Rectangle(double length, double width)
	{
		this.length= length;
		this.width = width;
	}
	public double perimeter()
	{
		return ((length*2) + (width*2));
	}
	public double area()
	{
		return (length * width);
	}
	public String toString() {
		return "Rectangle Width: " + width + " Length: " + length + " Area: " + this.area() + " Perimeter: "
				+ this.perimeter();
	}
}
