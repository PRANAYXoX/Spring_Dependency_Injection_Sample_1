package sp.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import sp.beans.*;

public class StudentBeanProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object obj, String str) throws BeansException {
		// TODO Auto-generated method stub
		Student std=(Student)obj;
		std.setName("MIKHAEL");
		std.setRoll("RON--504");
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String str) throws BeansException {
		// TODO Auto-generated method stub
		Student std= (Student)obj;
		std.setName("Mustaine");
		std.setRoll("JB007");
		return std;
	}

}
