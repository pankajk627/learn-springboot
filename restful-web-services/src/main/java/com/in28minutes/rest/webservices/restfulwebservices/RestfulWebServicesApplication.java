package com.in28minutes.rest.webservices.restfulwebservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.HelloWorldController;

@SpringBootApplication
public class RestfulWebServicesApplication implements CommandLineRunner {

	@Autowired
	HelloWorldController helloWorld;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("{}", helloWorld.HelloWorld());
	}

}
