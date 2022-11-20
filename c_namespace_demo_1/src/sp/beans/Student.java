package sp.beans;

public class Student {
	
	private String name;
	private String roll;
	private int marks;
	
	public Student(String name, String roll, int marks) {
		this.name=name;
		this.roll=roll;
		this.marks=marks;
	}
	public String getName() {
		return name;
	}
	
	public String getRoll() {
		return roll;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void display() {
		System.out.print("\nNAME: "+name);
		System.out.print("\nROLL: "+roll);
		System.out.print("\nMARKS: "+marks);
	}
	
}
