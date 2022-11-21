package sp.beans;

public class Employee {
		
	private String name;
	private String phoneNo;
	private String city;
	private String aadhaarCard;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAadhaarCard() {
		return aadhaarCard;
	}
	public void setAadhaarCard(String aadhaarCard) {
		this.aadhaarCard = aadhaarCard;
	}
	
	public void display() {
		System.out.print("\nEMP--NAME: "+name);
		System.out.print("\nEMP--PHONE: "+phoneNo);
		System.out.print("\nEMP--CITY: "+city);
		System.out.print("\nEMP--AADHAAR: "+aadhaarCard);
	}

}
