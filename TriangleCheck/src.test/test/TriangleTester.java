package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ts.TriangleChecker;

public class TriangleTester {
	@Test
	public void testTriangle() {
		TriangleChecker tc=new TriangleChecker();
		assertEquals("equilateral",tc.isTrigon(5, 5, 5) );
		assertEquals("isosceles", tc.isTrigon(5, 5, 6));
		assertEquals("scalene", tc.isTrigon(3, 4, 5));
		assertEquals("NotTriangle", tc.isTrigon(12, 5, 5));
		assertEquals("NotTriangle", tc.isTrigon(-10, 7, 5));
	}

}
