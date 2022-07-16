package com.in28minutes.learnspringboot.cdi;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {
	
	@Mock
	SomeCDIDAO daoMock;
	
	@InjectMocks
	SomeCDIBusiness business;

	@Test
	public void test() {
		when(daoMock.getData()).thenReturn(new int[] {20, 40, 60});
		int result = business.findGreatest();
		assertEquals(60, result);	
	}
	
	@Test
	public void testBasicScenario_NoElements() {
		when(daoMock.getData()).thenReturn(new int[] { });
		assertEquals(Integer.MIN_VALUE, business.findGreatest());
	}

	@Test
	public void testBasicScenario_EqualElements() {
		when(daoMock.getData()).thenReturn(new int[] { 2,2});
		assertEquals(2, business.findGreatest());
	}

}
