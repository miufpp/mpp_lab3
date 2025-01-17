package lab3.prob4;

public class Trailer extends Property{
	private final double rent = 400;
	public Trailer(String street, String city, String state, String zip) {
		super(street, city, state, zip);
	}
	
	@Override
	public double computeRent() {
		return rent;
	}

}
