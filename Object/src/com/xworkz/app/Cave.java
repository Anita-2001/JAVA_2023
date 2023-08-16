package com.xworkz.app;

public class Cave {
	private int width;
	private String name;
	private int length;
	private  String type;
	private String color;
	private int height;
	private String place;
	private String shape;
	private String material;
	private boolean exist;
	public Cave() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cave(int width, String name, int length, String type, String color, int height, String place, String shape,
			String material, boolean exist) {
		super();
		this.width = width;
		this.name = name;
		this.length = length;
		this.type = type;
		this.color = color;
		this.height = height;
		this.place = place;
		this.shape = shape;
		this.material = material;
		this.exist = exist;
	}
	@Override
	public String toString() {
		
		return this.color+this.height+this.length+this.length+this.material+this.material+this.name+this.place+this.shape+this.type+this.width;
	}
	
	
	
	

}
