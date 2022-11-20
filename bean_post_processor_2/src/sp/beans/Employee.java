package sp.beans;

public class Employee {
	
	private String name;
	private String phoneNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public void display() {
		System.out.print("\nNAME: "+name);
		System.out.print("\nNAME: "+phoneNo);
	}

}
