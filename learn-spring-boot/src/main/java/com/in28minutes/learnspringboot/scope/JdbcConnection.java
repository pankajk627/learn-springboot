package com.in28minutes.learnspringboot.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, 
		proxyMode = ScopedProxyMode.TARGET_CLASS) // To get a new Jdbc connection everytime

//Whenever there is a dependency and its scope is prototype, we need to use Proxy

public class JdbcConnection {
	
	public JdbcConnection() {
		System.out.println("JDBC Connection");
	}

}
