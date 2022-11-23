package di.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import di.beans.*;
public class Test {
	
	static public void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("/di/resources/applicationContext.xml");
		Student std=(Student)ctx.getBean("bean_std");
		std.display();
	}

}
