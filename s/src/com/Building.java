package com;

public class Building {
	public Floor[] floors;
	public Lift[] lifts;

	public Building(Floor[] floors, Lift[] lifts) {
		this.floors = floors;
		this.lifts = lifts;
	}

	public void printInfo() {
		for (int i = 0; i < floors.length; i++) {
			Floor ref3 = floors[i];
			ref3.printInfo();
		}
		for (int pos = 0; pos < lifts.length; pos++) {
			Lift ref5 = lifts[pos];
			ref5.printInfo();
		}
	}

}
