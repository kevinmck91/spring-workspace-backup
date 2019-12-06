package org.javabrains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {
	
	private Point center;
	@Autowired
	private MessageSource messageSource;
	
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}

	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void draw() {
	
		System.out.println(this.messageSource.getMessage("greeting", null, "Default Greeting", null));
		
		System.out.println(this.messageSource.getMessage(	"drawing.circle", 	
															null, 
															"Default drawing method", 
															null	));
														
		
		System.out.println(this.messageSource.getMessage(	"drawing.point", 
															new Object[] {center.getX() , center.getY()}, 
															"Default point method", 
															null	));
		

		
	}

}
