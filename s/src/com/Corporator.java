package com;

public class Corporator {
	Building[] buildings;
	public String name;

	public Corporator(String name, Building[] buildings) {
		this.name = name;
		this.buildings = buildings;
	}

	public void printInfo() {
		System.out.println("name is:" + name);
		for (int place = 0; place < buildings.length; place++) {
			Building bud = buildings[place];
			bud.printInfo();
		}
	}

}
