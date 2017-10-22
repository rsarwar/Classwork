package shapes;
/*
 * Ramisha Sarwar
 */
public class Parallelogram extends Rectangle{
	double length;
	double width;
	double height;
	public Parallelogram(double length, double width, double height)
	{
		super(length, width);
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public double area()
	{
		return (length *height);
	}
	public String toString() {
		return "Rhombus Width: " + width + " Length: " + length + " Area: " + this.area() + " Perimeter: "
				+ this.perimeter();
	}
}
