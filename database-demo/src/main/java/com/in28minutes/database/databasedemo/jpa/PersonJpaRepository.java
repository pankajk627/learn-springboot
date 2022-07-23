package com.in28minutes.database.databasedemo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
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
	
	public List<PersonJpa> findAll(){
		TypedQuery<PersonJpa> namedQuery = entityManager.createNamedQuery("find_all_person", PersonJpa.class);
		return namedQuery.getResultList();
	}
	
	public PersonJpa findById(int id) {
		return entityManager.find(PersonJpa.class, id);
	}
	
	public PersonJpa update(PersonJpa personJpa) {
		return entityManager.merge(personJpa);
	}
	
	public PersonJpa insert(PersonJpa personJpa) {
		return entityManager.merge(personJpa);
	}
	
	public void deleteById(int id) {
		PersonJpa personJpa = entityManager.find(PersonJpa.class, id);
		entityManager.remove(personJpa);
	}

}
