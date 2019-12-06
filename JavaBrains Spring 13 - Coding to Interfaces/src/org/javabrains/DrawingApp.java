package org.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		System.out.println(" ");
		
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
		
		System.out.println(" ");

		Shape shape = (Shape) context.getBean("triangle");
		shape.draw();
		
		System.out.println(" ");

		Shape shape2 = (Shape) context.getBean("circle");
		shape2.draw();

	}

}
