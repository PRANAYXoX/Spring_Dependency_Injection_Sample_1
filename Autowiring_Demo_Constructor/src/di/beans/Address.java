package di.beans;

public class Address {
	
	private String houseNo;
	private String street;
	private String city;
	
	
	
	public Address(String houseNo, String street, String city) {
		//super();
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
	}

	public String getHouseNo() {
		return houseNo;
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
}
