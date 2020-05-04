package com.efreelearn.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect  
@Component

public class LoginAspect {

	@Pointcut(value= "execution(* com.efreelearn.client.LoginController.*(..))")  
	private void displayLogMessage()   
	{   
		System.out.println("ANDREW LOG");
	}
	
	@Around(value= "displayLogMessage()")  
	public void aroundAdvice(ProceedingJoinPoint jp) throws Throwable   
	{  
	System.out.println("The method aroundAdvice() before invokation of the method " + jp.getSignature().getName() + " method");  
	try   
	{  
	jp.proceed();  
	}   
	finally   
	{  
	  
	}  
	System.out.println("The method aroundAdvice() after invokation of the method " + jp.getSignature().getName() + " method");  
	}  
}  
	

