package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Circle;

public class CircleTest {
	private final double DELTA = 0.0000000000000000001;
	@Test
	public void testCalculateArea() {
		Circle q = new Circle(1);
		assertEquals(Math.PI, q.calculateArea(), DELTA);
	}

	@Test
	public void testCircle() {
		Circle c = new Circle(1);
		assertEquals(1, c.getRadius(), DELTA);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeCricle()
	{
		new Circle(-1);
	}
	
	@Test
	public void testGetRadius() {
		Circle d = new Circle(8);
		assertEquals(8, d.getRadius(), DELTA);
	}

}
