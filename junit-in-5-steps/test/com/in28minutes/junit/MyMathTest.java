package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {
	//MyMath.add
	// 1,2,3 => 6
	
	MyMath myMath = new MyMath();
	
	@BeforeEach
	public void before() {
		System.out.println("Before");
	}
	
	@AfterEach
	public void after() {
		System.out.println("After");
	}
	
	@BeforeAll
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterAll
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Test
	public void sum_with3numbers() {
		//fail("Not yet implemented");
		//Absence of failure is success
		System.out.println("Test1");
		int result = myMath.add(new int[] {1,2,3});
		//Check that result == 6
		assertEquals(6, result);
	}
	
	@Test
	public void sum_with1number(){
		System.out.println("Test2");
		assertEquals(3, myMath.add(new int[] {3}));	
	}
	

}
