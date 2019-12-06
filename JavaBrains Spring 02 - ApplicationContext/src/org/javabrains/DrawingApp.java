package org.javabrains;

import org.javabrains.Triangle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {

		
		//2 Spring ApplicationContext method (needs XML file inside src)
		ApplicationContext context = new ClassPathXmlApplicationContext("springInner.xml");
		Triangle triangle3 = (Triangle) context.getBean("triangle");
		triangle3.draw();
		
		
	}

}
