package com.in28minutes.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.learnspringboot.basic.BinarySearchImpl;
import com.in28minutes.learnspringboot.scope.PersonDAO;

@SpringBootApplication
public class LearnSpringBootScopeApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(LearnSpringBootScopeApplication.class, args);

		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
	}

}
