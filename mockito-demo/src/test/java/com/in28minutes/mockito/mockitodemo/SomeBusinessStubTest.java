package com.in28minutes.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessStubTest {

	@Test
	void testFindGreatest() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result = businessImpl.findGreatest();
		assertEquals(18, result);
	}

}

class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		
		return new int[] {10,12,6,18};
	}
	
}
