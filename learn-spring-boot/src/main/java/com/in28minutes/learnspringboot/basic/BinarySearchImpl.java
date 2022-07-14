package com.in28minutes.learnspringboot.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // Default Scope of a bean is Singleton
public class BinarySearchImpl {
	
	private static Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);

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
	
	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}
	
	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
	}

}
