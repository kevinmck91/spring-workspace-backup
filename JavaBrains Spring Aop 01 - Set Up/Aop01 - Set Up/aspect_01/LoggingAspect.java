package aspect_01;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(public String getName())")
	public void LoggingAdvice(){
		System.out.println("LOGGER : Advice Run. Get method called");
	}
	
	
	

}
