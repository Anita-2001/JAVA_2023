package com;

public class Sport {

	public String name;
	public Player[] players;

	public Sport(String name, Player[] player) {
		this.name = name;
		this.players = player;
	}

	public void printInfo() {
		System.out.println(this.name);
		if (players != null) {
			for (int pos = 0; pos < players.length; pos++) {
				Player ref = players[pos];
				ref.printInfo();
			}
		} else {
			System.out.println("Playars is not there ");
		}
	}

}
