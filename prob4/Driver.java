package lab3.prob4;

public class Driver {

	public static void main(String[] args) {

		Property[] objects = { 
				new House(9000, null), 
				new Condo(2, null), 
				new Trailer(null) };
		double totalRent = Admin.computeTotalRent(objects);
		System.out.printf("%,.2f",totalRent); 
	}
}
