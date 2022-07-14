package com.in28minutes.learnspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.learnspringboot.xml.XMLPersonDAO;

public class LearnSpringBootXMLContextApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(LearnSpringBootXMLContextApplication.class);
	
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		LOGGER.info("Beans Loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());
		
		XMLPersonDAO xmlPersonDao = applicationContext.getBean(XMLPersonDAO.class);

		LOGGER.info("{} {}",xmlPersonDao, xmlPersonDao.getXMLJdbcConnection());
		
		applicationContext.close();
		
	}

}
