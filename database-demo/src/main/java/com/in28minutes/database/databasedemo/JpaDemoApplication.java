package com.in28minutes.database.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.PersonJpa;
import com.in28minutes.database.databasedemo.jpa.PersonJpaRepository;

//@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("All Persons -> {}", repository.findAll());
		logger.info("Person with id as 10001 -> {}", repository.findById(10001));
		logger.info("Updating PersonJpa(10003)", repository.update(new PersonJpa(10003,"Peter","Hague")));
		logger.info("Inserting PersonJpa(1)", repository.update(new PersonJpa("Pankaj","Lakhisarai")));		
		repository.deleteById(10002);
		
	}

}
