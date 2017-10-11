package shapes;

public class Circle extends Shape {
	private double radius;
	
	/*
	 * Complete the implementation of this class by finishing the constructor
	 * below.  Circles must have a positive radius.
	 */
	public Circle(double radius) throws IllegalArgumentException {
		if (radius > 0)
			this.radius = radius; 
		else
			throw new IllegalArgumentException("Radius cannot be negative or zero, fool.");
	}
	
	/*
	 *  Implement any remaining methods demanded by the superclass.
	 */
	public double calculateArea()
	{
		return Math.PI*radius*radius;
	}
	
	public double getRadius() {
		return radius;
	}
}
