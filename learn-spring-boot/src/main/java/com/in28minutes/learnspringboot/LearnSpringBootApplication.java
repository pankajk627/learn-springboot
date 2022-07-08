package com.in28minutes.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);
		
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());
		int result = binarySearch.binarySearch(new int[] {12, 15},3);
		System.out.println(result);
	}

}
