package com.in28minutes.learnspringboot.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Component
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Repository
public class PersonDAO {
	
	@Autowired
	JdbcConnection jdbcConnection;

	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
		
}