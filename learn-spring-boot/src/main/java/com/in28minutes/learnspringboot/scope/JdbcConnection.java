package com.in28minutes.learnspringboot.scope;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {
	
	public JdbcConnection() {
		System.out.println("JDBC Connection");
	}

}
