package com.in28minutes.learnspringboot.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.learnspringboot.LearnSpringBootBasicApplication;

// Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = LearnSpringBootBasicApplication.class)
public class BinarySearchTest {
	
	// Get this bean from the context
	@Autowired
	BinarySearchImpl binarySearchImpl;

	@Test
	public void test() {
		// call method on binarySearch
		int result = binarySearchImpl.binarySearch(new int[] {}, 5);
		
		// check if the value is correct
		assertEquals(3, result);
		
	}

}
