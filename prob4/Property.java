package lab3.prob4;

public abstract class Property {
	private Address address;
	public Property(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}
	
	abstract double getRent();
	
	@Override
	public String toString() {
		return "Property [ address= " + address + "]";
	}	
}
