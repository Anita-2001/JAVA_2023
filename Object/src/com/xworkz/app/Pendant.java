package com.xworkz.app;

public class Pendant {
  private float price;
	private  String type;
	private String material;
	 private int size;
	 private float cost;
	 private String color;
	 private int width;
	 private int weight;
	 private int length;
	 private String brand;
	 private int no;
	public Pendant() {
		super();
		System.out.println("noargument");
	}
	public Pendant(float price, String type, String material, int size, float cost, String color, int width, int weight,
			int length, String brand, int no) {
		super();
		this.price = price;
		this.type = type;
		this.material = material;
		this.size = size;
		this.cost = cost;
		this.color = color;
		this.width = width;
		this.weight = weight;
		this.length = length;
		this.brand = brand;
		this.no = no;
	}
	@Override
	public String toString() {
	
		return price+type+material+size+cost+color+width+weight+length+brand+no;
	}
	 

}
