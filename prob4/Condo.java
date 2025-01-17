package lab3.prob4;

public class Condo extends Property {

	private int numFloors;
	

	public Condo(int numFloors, Address address) {
		super(address);
		this.numFloors = numFloors;
	}

	@Override
	public double getRent() {
		return 400 * numFloors;
	}

}
