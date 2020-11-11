package br.com.cauezito.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void addTest() {
		MathUtils math = new MathUtils();		
		assertEquals(20, math.add(15, 10), "This method should add two numbers");
	}
	
	@Test
	void computeCircleTest() {
		MathUtils math = new MathUtils();	
		double expected = 314.1592653589793;
		double actual = math.computeCircleArea(10);
		assertEquals(expected, actual, "This method should return the correct area of ​​the circle");
		
	}

}
