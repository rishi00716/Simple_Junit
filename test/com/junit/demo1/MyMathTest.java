package com.junit.demo1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MyMathTest {
	
	MyMath myMath = new MyMath();
	
	@Before
	public void before() {
		System.out.println("BEFORE");
	}
	
	@After
	public void after() {
		System.out.println("AFTER");
	}
	
	@BeforeClass
	public static void beforeclass() {
		System.out.println("BEFORE Class");
	}
	
	@AfterClass
	public static void afterclass() {
		System.out.println("AFTER Class");
	}
	
	@Test
	public void sumwith3numbers() {
	
		System.out.println("Test1");
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
		
		//absence of failure is success
	}
	
	@Test
	public void sumwith1numbers() {
	
		System.out.println("test2");
		assertEquals(3,myMath.sum(new int[] {3}));
		
		//absence of failure is success
	}

}
