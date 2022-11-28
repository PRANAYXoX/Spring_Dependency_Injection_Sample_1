package sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {
		private String name;
		private int roll;
		private Address address;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRoll() {
			return roll;
		}
		public void setRoll(int roll) {
			this.roll = roll;
		}
		public Address getAddress() {
			return address;
		}
		
		//@Required
		@Autowired(required = true)
		public void setAddress(Address address) {
			this.address = address;
		}
		
		public void display() {
			System.out.print("\nNAME: "+name);
			System.out.print("\nROLL: "+roll);
			System.out.print("\nAddress:"+address.getHouseno()+", "+address.getCity()+", "+address.getStreet());
		}
		
		
}
