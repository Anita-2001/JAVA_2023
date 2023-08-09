package com.google;

public class Place extends City{
	
	public void live()
	{
		System.out.println("Invoking live in place no arg");
	}
	@Override
	public void live(String name) {
		// TODO Auto-generated method stub
		super.live(name);
	}
	@Override
	public void live(String name, String location, double area) {
		// TODO Auto-generated method stub
		super.live(name, location, area);
		
	}
	@Override
	public void live(String name, String location, double area, double people, int number) {
		// TODO Auto-generated method stub
		super.live(name, location, area, people, number);
	}
	
	
	
}
