package com.in28minutes.learnspringboot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.learnspringboot.xml.XMLPersonDAO;

public class LearnSpringBootXMLContextApplication {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		XMLPersonDAO xmlPersonDao = applicationContext.getBean(XMLPersonDAO.class);

		System.out.println(xmlPersonDao);
		System.out.println(xmlPersonDao.getXMLJdbcConnection());
		
		applicationContext.close();
		
	}

}
