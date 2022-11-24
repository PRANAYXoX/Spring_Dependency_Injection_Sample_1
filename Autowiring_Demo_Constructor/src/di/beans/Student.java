package di.beans;

public class Student {
	
	private String name;
	private int rollno;
	private Address address;
	
	

	public Student(String name, int rollno, Address address) {
		//super();
		this.name = name;
		this.rollno = rollno;
		this.address = address;
	}


	public void display() {
		System.out.print("\nNAME: "+name);
		System.out.print("\nrollno: "+rollno);
		System.out.print("\nHOUSE NO: "+address.getHouseNo()+"\nADDRESS: "+address.getCity()+"\nSTREET: "+address.getStreet());
	}
	

}
