package org.javabrains.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
		

	
	@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint joinPoint){
		System.out.println("@Before1 Advice Run " + joinPoint.toString());
	}
	
	@Before("allCircleMethods()")
	public void LoggingAdvice2(JoinPoint joinPoint){
		System.out.println("@Before2 Advice Run " + joinPoint.getTarget());
	}
	
	@Before("args(name)")
	public void stringArgumentsMethods(String name){
		System.out.println("@Before3 -  A method that takes string args has been called. Value = " + name);
	}
	
	@After("args(name)")
	public void stringArgumentsMethods2(String name){
		System.out.println("@After4 - A method that takes string args has been called. Value = " + name);
	}

	@AfterReturning("args(name)")
	public void stringArgumentsMethods3(String name){
		System.out.println("@AfterReturning5 - This runs after the target method runs successfully. Value = " + name);
	}
	
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void stringArgumentsMethods4(String name, String returnString){
		System.out.println("@AfterReturning6 - This runs after the target method runs successfully. Value in = " + name + ". Value out = " + returnString);
	}
	
	@AfterThrowing("args(name)")
	public void stringArgumentsMethods4(String name){
		System.out.println("@AfterThrowing7 - This runs after the target method runs but with an error. Value = " + name);
	}
	
	@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void stringArgumentsMethods5(String name, Exception ex){
		System.out.println("@AfterThrowing8 - This runs after the target method runs but with an error. ValueIn = " + name + ". ExceptionOut = " + ex.toString() );
	}
	
	@Around("execution(public * aroundAdvice())")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		
		Object returnValue= null;
		
		try {
			System.out.println("@Around - before proceedingJoinPoint.proceed(); is called");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("@Around -after proceedingJoinPoint.proceed(); is called");
		} catch (Throwable e) {
			System.out.println("@Around - Error: Catch Block called");
		}
		System.out.println("@Around - After Finally");
		return returnValue;
	}
	
	@Pointcut("within(org.javabrains.model.*)")
	public void allCircleMethods(){	}


}
