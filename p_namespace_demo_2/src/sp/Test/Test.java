package sp.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sp.bean.*;
public class Test {
	
	static public void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("/sp/resources/applicationContext.xml");
		Student st=(Student)ctx.getBean("bean_1");
		st.display();
	}

}
