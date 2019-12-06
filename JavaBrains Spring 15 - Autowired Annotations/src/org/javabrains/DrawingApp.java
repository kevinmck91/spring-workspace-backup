package org.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
	
		System.out.println(" ");

		Shape shape2 = (Shape) context.getBean("circle");
		shape2.draw();

	}

}
