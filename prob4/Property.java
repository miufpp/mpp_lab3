package lab3.prob4;

public abstract class Property {
	private Address address;
	private String street, city, state, zip;
	
	public Property(String street, String city, String state, String zip) {
		this.address = new Address(street, city, state, zip);
	}
	
	public void addAddress(String street, String city, String state, String zip) {
		this.address = new Address(street, city, state, zip);
	}

	public Address getAddress() {
		return address;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}
	
	abstract double computeRent();
	
	@Override
	public String toString() {
		return "Property [ address= " + address + "]";
	}	
}
