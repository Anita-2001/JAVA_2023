package com.xworkz.app;

public class Kerchief {
	
	private String color;
	private int size;
	private float cost;
	private boolean quality;
	private String type;
	private int width;
	private String country;
	Kerchief() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Kerchief(String color, int size, float cost, boolean quality, String type, int width, String country) {
		super();
		this.color = color;
		this.size = size;
		this.cost = cost;
		this.quality = quality;
		this.type = type;
		this.width = width;
		this.country = country;
	}
	@Override
	public String toString() {
		return color+size+cost+quality+type+width+country+"Kerchief";
	}
	

}
