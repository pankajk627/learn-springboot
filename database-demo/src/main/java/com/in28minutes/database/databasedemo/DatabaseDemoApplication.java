package com.in28minutes.database.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDAO;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDAO personJdbcDAO;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("All Persons -> {}", personJdbcDAO.findAll());
		logger.info("Person with id as 10001 -> {}", personJdbcDAO.findById(10001));
		logger.info("Deleting Person(10002) -> No. of rows deleted - {}", personJdbcDAO.deleteById(10002));
		logger.info("All Persons -> {}", personJdbcDAO.findAll());
		logger.info("Adding Person(10004) -> No. of rows added -> {}", personJdbcDAO.insert(new Person(10004,"Susmita","Kolkata")));
		logger.info("All Persons -> {}", personJdbcDAO.findAll());
		logger.info("Updating Person(10004) -> No. of rows updated -> {}", personJdbcDAO.update(new Person(10004,"Pankaj","Kolkata")));
		logger.info("All Persons -> {}", personJdbcDAO.findAll());
		
	}

}
