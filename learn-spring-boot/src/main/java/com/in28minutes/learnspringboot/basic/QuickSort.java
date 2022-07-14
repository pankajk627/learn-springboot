package com.in28minutes.learnspringboot.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Component
@Service
@Qualifier("quick")
public class QuickSort implements SortAlgorithm {

	public int[] sort(int[] numbers) {
		return numbers;
	}

}
