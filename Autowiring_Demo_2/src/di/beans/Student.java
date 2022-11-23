package di.beans;

public class Student {
	
	private String name;
	private int rollno;
	private Address address;
	private Subjects subjects;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	public Subjects getSubjects() {
		return subjects;
	}

	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}


	public void display() {
		System.out.print("\nNAME: "+name);
		System.out.print("\nrollno: "+rollno);
		System.out.print("\nHOUSE NO: "+address.getHouseNo()+"\nADDRESS: "+address.getCity()+"\nSTREET: "+address.getStreet());
		System.out.print("\nSUBJECTS: "+subjects.getSubjects());
	}

}
