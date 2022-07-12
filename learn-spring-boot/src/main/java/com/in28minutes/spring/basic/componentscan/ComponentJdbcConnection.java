package com.in28minutes.spring.basic.componentscan;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, 
		proxyMode = ScopedProxyMode.TARGET_CLASS) // To get a new Jdbc connection everytime

//Whenever there is a dependency and its scope is prototype, we need to use Proxy

public class ComponentJdbcConnection {
	
	public ComponentJdbcConnection() {
		System.out.println("ComponentJDBC Connection");
	}

}
