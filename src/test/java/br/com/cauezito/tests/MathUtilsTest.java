package br.com.cauezito.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	MathUtils math;
	
	/* Execute before each test run */
	@BeforeEach
	void init() {
		math = new MathUtils();
	}

	@Test
	void addTest() {
		assertEquals(25, math.add(15, 10), "This method should add two numbers");
	}
	
	@Test
	void divideTest() {
		assertThrows(ArithmeticException.class, () -> math.divide(5,0), "This method should divide by zero and generate an error");
	}
	
	@Test
	void computeCircleTest() {
		double expected = 314.1592653589793;
		double actual = math.computeCircleArea(10);
		assertEquals(expected, actual, "This method should return the correct area of ​​the circle");
		
	}

}
