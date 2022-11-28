package sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Student {
		private String name;
		private int roll;
		
		private Address address;
		
		@Autowired(required = true)
		public Student(String name, int roll, @Qualifier("address1") Address address) {
			this.name=name;
			this.roll=roll;
			this.address=address;
		}
		
		
		public void display() {
			System.out.print("\nNAME: "+name);
			System.out.print("\nROLL: "+roll);
			System.out.print("\nAddress:"+address.getHouseno()+", "+address.getCity()+", "+address.getStreet());
		}
		
		
}
