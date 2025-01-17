package lab3.prob4;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		
		Property[] properties = { 
				new House(9000, null), 
				new Condo(2, null), 
				new Trailer(null) };
		Admin admin = new Admin(Arrays.stream(properties).toList());
		double totalRent = admin.computeTotalRent();
		System.out.printf("%,.2f",totalRent); 
	}
}
