package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
@Aspect
//Configuration
@Configuration
public class UserAccessAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// What kind of method I would intercept
	// execution(* PACKAGE.*.*(..))
	
	@Before("execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))")
	public void before(JoinPoint joinPoint) {
		//what to do?
		logger.info("Check for User Access");
		logger.info("Allowed access for - {}", joinPoint);
	}
}
