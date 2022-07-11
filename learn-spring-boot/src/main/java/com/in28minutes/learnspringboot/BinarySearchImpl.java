package com.in28minutes.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
//	Autowiring by Type
//	@Autowired
//	private SortAlgorithm sortAlgorithm;

//  Autowiring by Name
//	@Autowired
//	private SortAlgorithm quickSort;
	
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
	
//  Constructor type injection	
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}
	
//	Setter type injection
//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int[] sortedArray = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 3;
	}

	

}
