package lab3.prob4;

public class Trailer extends Property{
	private final double rent = 400;
	public Trailer(Address address) {
		super(address);
	}
	
	@Override
	public double getRent() {
		return rent;
	}

}
