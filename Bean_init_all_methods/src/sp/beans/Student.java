package sp.beans;

import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean {
	
	private String name;
	private int rollno;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.print("Setter accessed!");
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.print("\nInitializing Bean Interface\n");
		name="Priya Weds Pranay";
		rollno=990700;
	}
	
	public void initBean() {
		System.out.print("\nBEAN INIT()\n");
		name="Priya Karn";
		rollno=1995;
	}
	
	public void display() {
		System.out.print("\nNAME: "+name);
		System.out.print("\nNAME: "+rollno);
	}
	

}
