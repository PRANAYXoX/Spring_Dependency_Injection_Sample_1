package sp.bean;

public class Student {
	
	private String name;
	private String roll;
	private int marks;
	private String course;
	
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display() {
		System.out.print("\nNAME: "+name);
		System.out.print("\nROLL: "+roll);
		System.out.print("\nMARKS: "+marks);
		System.out.print("\nADDRESS: "+address.getLane()+"--"+address.getCity());
	}
}
