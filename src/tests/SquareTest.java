// Ashley Randt

https://github.com/jjmonte/quiz-2-1-jjmonte/blob/master/src/tests/SquareTest.javapackage tests;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Square;

public class SquareTest {
	private final double DELTA = 0.0000000001;
	@Test
	public void testSquare() {
		Square s = new Square(1);
		assertEquals(1, s.getSide(), DELTA);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeSquare(){
		new Square(-1);
	}
	@Test
	public void testCalculateArea() {
		Square s = new Square(2);
		assertEquals(4, s.calculateArea(), DELTA);
	}

	@Test
	public void testGetSide() {
		Square s = new Square(1);
		assertEquals(1, s.getSide(), DELTA);
	}

}
