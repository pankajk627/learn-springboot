package com.in28minutes.learning.jpa.jpain10minutes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learning.jpa.jpain10minutes.entity.User;
import com.in28minutes.learning.jpa.jpain10minutes.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserDAOService service;

	@Override
	public void run(String... args) throws Exception {

		User user = new User("Jack", "Admin");
		long id = service.insert(user);
		logger.info("New User Created " + user);

	}

}
