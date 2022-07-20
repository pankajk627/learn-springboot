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
	
	// Pointcut - The expression which defines what kind of method that would be intercepted
	// Advice - The logic which needs to be implemented when the interception is made
	// Aspect - Combination of Pointcut and Advice
	// Join Point - Specific interception of a method call
	// Weaving - The process of implementing the AOP aroung the method call is called Weaving
	// Weaver - The framework which does Weaving is known as Weaver
	
	@Before("com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void before(JoinPoint joinPoint) {
		//what to do?
		logger.info("Check for User Access");
		logger.info("Allowed access for - {}", joinPoint);
	}
}
