package org.javabrains.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("allGetters()")
	public void LoggingAdvice(){
		System.out.println("Advice Run. Get method called");
	}
	
	@Before("allGetters()")
	public void SecondAdvice(){
		System.out.println("Second Advice executed");
	}
	
	//A dummy method that is being used to gather all other befre methods
	@Pointcut("execution(public * get*())")
	public void allGetters(){
		
	}
	

}
