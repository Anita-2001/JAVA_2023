package com.ubdt;

import com.Area;
import com.Corporator;
import com.Floor;
import com.HomeTown;
import com.Lift;
import com.Player;
import com.Sport;
import com.ubdt.app.Building;

public class SportMain {

	public static void main(String[] args) {

		System.out.println("running main in SportRunner");

		String name = "Cricket";

		Floor floor = new Floor(" first floor", 1);
		Floor floor1 = new Floor("second floor", 2);
		Floor floor2 = new Floor("second floor", 3);
		Floor floor3 = new Floor("second floor", 4);
		Floor floor4 = new Floor("second floor", 5);

		Floor[] floors = { floor, floor1, floor2, floor3, floor4 };

		Lift lifts = new Lift(1);
		Lift lifts1 = new Lift(2);

		Lift[] lif = { lifts, lifts1 };

		Building building = new Building(floors, lif);
		Building building1 = new Building(floors, lif);

		Building[] buildings = { building, building1 };

		Corporator corporator = new Corporator("shree", buildings);
		Corporator corporator1 = new Corporator("tejas", buildings);
		Corporator corporator2 = new Corporator("suhas", buildings);

		Area area = new Area("dvg", corporator);
		Area area1 = new Area("hasan", corporator1);
		Area area2 = new Area("malleshwaram", corporator1);
		Area area3 = new Area("jaynagar", corporator2);
		Area area4 = new Area("btm layout", corporator1);

		Area[] areas = { area, area1, area2, area3, area4 };

		HomeTown town = new HomeTown("Bangalore", 678976, areas);

		Player player = new Player(building, "janavi", 3, town);
		Player player1 = new Player(building1, "sanvi", 4, town);

		Player[] players = { player, player1 };

		Sport sport = new Sport(name, players);
		sport.printInfo();

	}

}
