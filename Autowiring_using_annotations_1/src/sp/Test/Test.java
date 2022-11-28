package sp.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sp.beans.*;
public class Test {
	
	static public void main(String[] args) {
	
		ApplicationContext ctx=new ClassPathXmlApplicationContext("/sp/resources/applicationContext.xml");
		Student std=(Student) ctx.getBean("std");
		std.display();
	}
}
