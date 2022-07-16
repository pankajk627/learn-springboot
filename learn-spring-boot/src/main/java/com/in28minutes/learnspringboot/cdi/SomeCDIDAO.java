package com.in28minutes.learnspringboot.cdi;

import javax.inject.Named;

@Named
public class SomeCDIDAO {
	
	public int[] getData() {
		return new int[] {5,10, 15};
	}

}
