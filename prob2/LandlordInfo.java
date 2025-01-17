package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
	private List<Building> buildings;
	private String name;

	public LandlordInfo() {
		this.buildings = new ArrayList<>();
	}

	public List<Building> getBuildings() {
		return buildings;
	}
	
	public void addBuilding(Building building) {
		this.buildings.add(building);
	}

	public double calcProfits() {
		double profits = 0;
		for(Building bd: buildings) {
			profits += bd.buidingProfit();
		}
		return profits;
	}
}
