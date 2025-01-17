 package lab3.prob4;

import java.util.List;

public class Admin {
	private List<Property> properties;
	public Admin(List<Property> properties) {
		this.properties = properties;
	}
	public double computeTotalRent() {
		double totalRent = 0;
//		
		for(Property p: properties) {
			if(p != null) {
				totalRent += p.getRent();
			}
		}
		return totalRent;
	}
}
