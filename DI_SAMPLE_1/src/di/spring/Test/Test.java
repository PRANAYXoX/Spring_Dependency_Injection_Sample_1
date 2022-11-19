package di.spring.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import di.spring.beans.*;
public class Test {
	
	static public void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("/di/spring/resources/applicationContext.xml");
		Student std=(Student)ctx.getBean("bean_1");
		std.display();
	}

}
