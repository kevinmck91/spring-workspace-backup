package org.javabrains;

import org.javabrains.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aopmain {

	public static void main(String[] args) {


		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		
			System.out.println("   ");	
		shapeService.getCircle().setName("kev");
			System.out.println("   ");
		System.out.println(shapeService.getCircle().getName());
			System.out.println("   ");
	
		try {
			shapeService.getCircle().throwAnError("kevin");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("");
		}
		
			System.out.println("   ");
		shapeService.getCircle().valueInValueOut("kevinMck");
			System.out.println("   ");
		shapeService.getCircle().aroundAdvice();
	}

}
