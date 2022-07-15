package com.in28minutes.learnspringboot;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learnspringboot.basic.BinarySearchImpl;

//@SpringBootApplication
@Configuration
@ComponentScan //@ComponentScan("com.in28minutes.learnspringboot")//
public class LearnSpringBootBasicApplication {

	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for the beans?

	public static void main(String[] args) {

		// BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());
		// Application Context
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(LearnSpringBootBasicApplication.class);
				
				//SpringApplication.run(LearnSpringBootBasicApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(binarySearch);
		System.out.println(binarySearch1);

		int result = binarySearch.binarySearch(new int[] { 12, 15 }, 3);
		System.out.println(result);
		
		applicationContext.close();
		
	}

}
