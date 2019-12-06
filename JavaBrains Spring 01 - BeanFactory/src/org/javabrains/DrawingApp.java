// SpringDemo01 - BeanFactory

package org.javabrains;

import org.javabrains.Triangle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {

		//Non Spring method
		Triangle triangle = new Triangle();
		triangle.draw();

		//1. Spring BeanFactory method (needs XML file outside src)
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("springOuter.xml"));
		Triangle triangle2 = (Triangle) factory.getBean("triangle");
		triangle2.draw();
			
		
	}

}
