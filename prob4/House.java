package lab3.prob4;

public class House extends Property{
	private double rent;
	private double lotSize;
	public House(double lotSize, String street, String city, String state, String zip) {
		super(street, city, state, zip);
		this.lotSize = lotSize;
	}

	
	public double getRent() {
		return rent;
	}


	public double getLotSize() {
		return lotSize;
	}


	@Override
	public double computeRent() {
		this.rent = 0.1 * this.lotSize;
		return this.rent;
	}

}
