package sp.beans;

import org.springframework.stereotype.Component;

@Component("empmod")
public class EmpModule {
	
	private String empId;
	private int salary;
	
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void display() {
		System.out.print("\nEMP-ID: "+empId);
		System.out.print("\nSALARY: "+salary);
	}

}
