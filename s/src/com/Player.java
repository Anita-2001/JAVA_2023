package com;

import com.ubdt.app.Building;

public class Player 
{
	public Building building;
	public String name;
	public int exp;
	public HomeTown town;
	
	public Player(Building building,String name,int exp,HomeTown town)
	{
		this.building=building;
		this.name=name;
		this.exp=exp;
		this.town=town;
	}
		public void printInfo()
	{
		System.out.println("building is:"+this.building);
		System.out.println("name is:"+this.name);
		System.out.println("exp is:"+this.exp);
		System.out.println("hometown is:"+this.town);
	}

}
