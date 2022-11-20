package sp.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sp.beans.*;

public class Test {
	
	static public void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("/sp/resources/applicationContext.xml");
		Student std1=(Student)ctx.getBean("bean_1");
		std1.display();
		System.out.print("\n-----------------------------------------------------------------------------");
		Employee std2=(Employee)ctx.getBean("bean_2");
		std2.display();
	}
}
