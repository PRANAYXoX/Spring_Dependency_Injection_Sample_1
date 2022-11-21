package sp.beans;

public class Employee {
	
	private String company;
	private int id;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void initBean() {
		company="IBM";
		id=446;
	}
	
	public void display() {
		System.out.print("\nCOMPANY: "+company);
		System.out.print("\nID: "+id);
	}

}
