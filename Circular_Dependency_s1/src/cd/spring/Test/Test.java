package cd.spring.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cd.spring.beans.*;
public class Test {

		static public void main(String[] args) {
			ApplicationContext ctx=new ClassPathXmlApplicationContext("/cd/spring/resources/applicationContext.xml");
			Student st=(Student)ctx.getBean("bean_1");
			Teacher thr=(Teacher)ctx.getBean("bean_2");
			System.out.print("\nStudent: "+st);
			System.out.print("\nTeacher: "+thr);
		}
}
