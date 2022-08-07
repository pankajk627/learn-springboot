package com.in28minutes.learning.jpa.jpain10minutes.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.learning.jpa.jpain10minutes.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}