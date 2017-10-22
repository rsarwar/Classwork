package shapes;

import java.util.Random;

public class ShapeUtilities {

	public static Shape getRandomShape()
	{
		Random r = new Random();
		int x = r.nextInt(5);
		switch(x)
		{
			case 0:
			{
				return new Circle(r.nextInt(100)+1);
			}
			case 1:
			{
				return new Rectangle((r.nextInt(100)+1), (r.nextInt(100)+1));
			}
			case 2:
			{
				return new Square(r.nextInt(100)+1);
			}
			case 3:
			{
				return new Triangle((r.nextInt(100)+1), (r.nextInt(100)+1),(r.nextInt(100)+1),(r.nextInt(100)+1));
			}
			case 4:
			{
				return new Parallelogram((r.nextInt(100)+1),(r.nextInt(100)+1),(r.nextInt(100)+1));
			}
			default:
			{
				return new Circle(r.nextInt(100)+1);
			}
		}
	}
	public static double sumPerimeter(Shape[] shapeArr)
	{
		double totalSum = 0;
		for(int i = 0; i<shapeArr.length;i++)
		{
			totalSum += shapeArr[i].perimeter();
		}
		return totalSum;
	}
	public static double sumArea(Shape[] shapeArr)
	{
		double totalArea = 0;
		for(int i = 0; i<shapeArr.length;i++)
		{
			totalArea += shapeArr[i].area();
		}
		return totalArea;
	}
}
