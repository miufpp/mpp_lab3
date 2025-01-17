package lab3.prob4;

public class Driver {

	public static void main(String[] args) {

		Property[] objects = { 
				new House(9000, null, null, null, null), 
				new Condo(2, null, null, null, null), 
				new Trailer(null, null, null, null) };
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent); 
	}
}
