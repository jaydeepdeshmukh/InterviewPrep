package com.jd.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SomeTest {

	Maths m = new Maths();
	@Before
	public void before() {
		System.out.println("in before");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("in before class");
	}
	
	
	
	@Test(expected = ArithmeticException.class)
	public void testAdd() {
		System.out.println("in test");
		assertEquals(3, m.divide(1, 0));
	}
	
	@Ignore
	public void testMul() {
		System.out.println("in test");
		assertEquals(3, m.mul(1, 2));
	}

	
	
	@AfterClass
	public static void afterClass() {
		System.out.println("in after class");
	}
	@After
	public void after() {
		System.out.println("in after");
	}

}
