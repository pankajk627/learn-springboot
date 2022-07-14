package com.in28minutes.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.learnspringboot.basic.BinarySearchImpl;

@SpringBootApplication
public class LearnSpringBootBasicApplication {

	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for the beans?

	public static void main(String[] args) {

		// BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());
		// Application Context
		ConfigurableApplicationContext applicationContext = SpringApplication.run(LearnSpringBootBasicApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(binarySearch);
		System.out.println(binarySearch1);

		int result = binarySearch.binarySearch(new int[] { 12, 15 }, 3);
		System.out.println(result);
		
		applicationContext.close();
		
	}

}
