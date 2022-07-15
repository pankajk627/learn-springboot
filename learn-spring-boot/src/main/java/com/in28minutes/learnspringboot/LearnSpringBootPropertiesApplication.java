package com.in28minutes.learnspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.in28minutes.learnspringboot.properties.SomeExternalService;

@SpringBootApplication
@PropertySource("classpath:app.properties") // test for file location
public class LearnSpringBootPropertiesApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(LearnSpringBootPropertiesApplication.class);
	
	@Autowired
	SomeExternalService someExternalService;
	
	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(LearnSpringBootPropertiesApplication.class, args);

		SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
		
		LOGGER.info("{}", service.returnServiceURL());
		
		applicationContext.close();
		
	}

}
