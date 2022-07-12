package com.in28minutes.learnspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.spring.basic.componentscan.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.in28minutes.spring.basic.componentscan")
public class LearnSpringBootComponentApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(LearnSpringBootComponentApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(LearnSpringBootComponentApplication.class, args);

		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", componentDAO);

	}

}
