package sp.beans;

public class Student {
	
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
		System.out.print("\nSTD--NAME: "+name);
		System.out.print("\nSTD--PHONE: "+phoneNo);
		System.out.print("\nSTD--CITY: "+city);
		System.out.print("\nSTD--AADHAAR: "+aadhaarCard);
	}

}
