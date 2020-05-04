package com.efreelearn.aop;


import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * Aspect for logging execution of service and repository Spring components.
 * @author Ramesh Fadatare
 *
 */

public class LoggingAspect {
	
	@Before(value = "execution(* com.efreelearn.client.LoginController(..))")
	public void beforeAdvice(JoinPoint joinPoint)
		{
		System.out.println("NOT ENABLED");
		}
	
	
}
	
