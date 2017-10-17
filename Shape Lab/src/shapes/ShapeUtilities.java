package shapes;

import java.util.Random;

public class ShapeUtilities {

	public static Shape getRandomShape()
	{
		Random r = new Random();
		int x = r.nextInt(2);
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
			default:
			{
				return new Circle(r.nextInt(100)+1);
			}
		}
	}
	public static double sumPerimeter(Shape[] shapeArr)
	{
		double totalSum = 0;
	}
}
