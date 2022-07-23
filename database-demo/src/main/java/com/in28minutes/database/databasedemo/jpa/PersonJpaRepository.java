package com.in28minutes.database.databasedemo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entity.PersonJpa;

//Repository
@Repository
//Transaction
@Transactional
public class PersonJpaRepository {
	
	// connect to the database
	@PersistenceContext
	EntityManager entityManager;
	
	public PersonJpa findById(int id) {
		return entityManager.find(PersonJpa.class, id);
	}

}
