package com.efreelearn.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect  
@Component

public class QuestionAnswerAspect {

	@Pointcut(value= "execution(* com.efreelearn.mvccontroller.QuestionAnswerInfoController.*(..))")  
	private void getQuestions()   
	{   
		System.out.println("ANDREW LOG");
	}
	
	@Around(value= "getQuestions()")  
	public void aroundAdvice(ProceedingJoinPoint jp) throws Throwable   
	{  
	System.out.println("BEFORE METHOD " + jp.getSignature().getName() + " method");  
	try   
	{  
	jp.proceed();  
	}   
	finally   
	{  
	  
	}  
	System.out.println("AFTER METHOD " + jp.getSignature().getName() + " method");  
	}  
}  
	

