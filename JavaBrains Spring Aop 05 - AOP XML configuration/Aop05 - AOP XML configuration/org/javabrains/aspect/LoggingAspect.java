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


public class LoggingAspect {
			
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
	
}
