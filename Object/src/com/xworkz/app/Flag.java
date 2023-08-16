package com.xworkz.app;

public class Flag {
	private String country;
	private String color;
	private int year;
	
	public Flag()
	{

	System.out.println("invoking noargument constructor");	
	}
	public Flag(String country, String color, int year) {
		super();
		this.country = country;
		this.color = color;
		this.year = year;
	}
	
   public String toString()
   {
	   
		return "country:"+this.country+ "color:"+this.color+"year:"+this.year;
	}



}
