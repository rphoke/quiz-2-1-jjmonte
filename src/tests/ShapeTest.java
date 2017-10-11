package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Circle;
import shapes.Square;

public class ShapeTest {

	private final double DELTA = .000000001;
	/*
	 * Write a test for Shape's compareTo method.
	 * 
	 * Also create SquareTest.java and CircleTest.java JUnit test cases.
	 * Test each class's constructor method and calculateArea method.
	 */
	@Test
	public void testCompareTo() {
		Circle a = new Circle(2);
		Square b = new Square(1);
		Circle c = new Circle(2);
		Square d = new Square(1);
		
		assertEquals(-1, b.compareTo(a), DELTA);
		assertEquals(1, a.compareTo(b), DELTA);
		assertEquals(0, a.compareTo(c), DELTA);
		assertEquals(0, b.compareTo(d), DELTA);
	}

}
