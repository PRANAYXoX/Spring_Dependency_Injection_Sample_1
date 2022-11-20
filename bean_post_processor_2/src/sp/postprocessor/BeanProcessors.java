package sp.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import sp.beans.*;
public class BeanProcessors implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object obj, String str) throws BeansException {
		// TODO Auto-generated method stub
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String str) throws BeansException {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student std=(Student)obj;
			std.setName(std.getName()+" NIRVANA");
			std.setRoll(std.getRoll()+"WWF");
			std.setMarks("450/500");
			return std;
		}else  {
			Employee emp=(Employee)obj;
			emp.setName("CHINESE CK");
			emp.setPhoneNo("9000088877");
			return emp;
		}
		//return null;
	}

}
