package org.javabrains.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("allGetters() && allCircleMethods()")
	public void LoggingAdvice(){
		System.out.println("This advice will run when a get method is called AND a circle method is called");
	}
	
	@Before("allGetters()")
	public void SecondAdvice(){
		System.out.println("This advice will run when a get method is called ");
	}
	
	@Pointcut("execution(public * get*())")
	public void allGetters(){}
	
	@Pointcut("within(org.javabrains.model.*)")
	public void allCircleMethods(){}


}
