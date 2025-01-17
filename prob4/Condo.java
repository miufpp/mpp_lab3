package lab3.prob4;

public class Condo extends Property {

	private int numFloors;
	private double rent;

	public Condo(int numFloors,String street, String city, String state, String zip) {
		super(street, city, state, zip);
		this.numFloors = numFloors;
	}

	@Override
	public double computeRent() {
		this.rent = 400 * this.numFloors;
		return this.rent;
	}

}
