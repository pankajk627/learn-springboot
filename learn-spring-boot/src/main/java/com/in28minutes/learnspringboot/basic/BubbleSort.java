package com.in28minutes.learnspringboot.basic;

import org.springframework.stereotype.Component;

@Component
// @Primary
// Precedence is given to @Primary than Autowiring by Name
public class BubbleSort implements SortAlgorithm {

	public int[] sort(int[] numbers) {
		return numbers;
	}

}
