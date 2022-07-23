package com.in28minutes.database.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.PersonJdbc;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDAO;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDAO personJdbcDAO;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("All Persons -> {}", personJdbcDAO.findAll());
		logger.info("Person with id as 10001 -> {}", personJdbcDAO.findById(10001));
		logger.info("Deleting PersonJpa(10002) -> No. of rows deleted - {}", personJdbcDAO.deleteById(10002));
		logger.info("All Persons -> {}", personJdbcDAO.findAll());
		logger.info("Adding PersonJpa(10004) -> No. of rows added -> {}", personJdbcDAO.insert(new PersonJdbc(10004,"Susmita","Kolkata")));
		logger.info("All Persons -> {}", personJdbcDAO.findAll());
		logger.info("Updating PersonJpa(10004) -> No. of rows updated -> {}", personJdbcDAO.update(new PersonJdbc(10004,"Pankaj","Kolkata")));
		logger.info("All Persons -> {}", personJdbcDAO.findAll());
		
	}

}
