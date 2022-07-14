package com.in28minutes.learnspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.learnspringboot.cdi.SomeCDIBusiness;

@SpringBootApplication
public class LearnSpringBootCDIApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(LearnSpringBootCDIApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(LearnSpringBootCDIApplication.class, args);

		SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);
		
		LOGGER.info("{} DAO ->{}", business,business.getSomeCDIDAO());

		applicationContext.close();
	}

}
