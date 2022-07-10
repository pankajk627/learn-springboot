package com.in28minutes.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnSpringBootApplication {
	
	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for the beans?

	public static void main(String[] args) {
		
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());
		//Application Context
		ApplicationContext applicationContext = 
				SpringApplication.run(LearnSpringBootApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {12, 15},3);
		System.out.println(result);
	}

}
