package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private double maintenanceCost;
	private List<Apartment> apartments;
	
	public Building(double maintenanceCost) {
		this.apartments = new ArrayList<>();
		this.maintenanceCost = maintenanceCost;
	}
	
	public double getMaintenanceCost() {
		return maintenanceCost;
	}

	public List<Apartment> getApartments() {
		return apartments;
	}

	public void addApartment(Apartment apartment) {
		this.apartments.add(apartment);
	}
	
	public double getRent() {
		double rent = 0;
		for(Apartment apt: apartments) {
			rent += apt.getRent();
		}
		return rent;
	}
	
	public double buidingProfit() {
		double profit = 0;
		profit = this.getRent() - this.maintenanceCost;
		return profit;
	}
	
	
}
