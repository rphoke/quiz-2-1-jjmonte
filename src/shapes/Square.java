package shapes;

public class Square extends Shape {
	private double side;

	/*
	 * Complete the implementation of this class by finishing the constructor
	 * below. Squares must have a positive side length.
	 */
	public Square(double side) throws IllegalArgumentException {

		if (side <= 0) {
			throw new IllegalArgumentException(
					"Side cannot be negative or zero");

		} else {
			this.side = side;
		}

		// TODO Implement me
	}

	/*
	 * Implement any remaining methods demanded by the superclass.
	 */

	public double getSide() {
		return side;
	}

	@Override
	public double calculateArea() {
		return this.getSide() * this.getSide();
	}

}
