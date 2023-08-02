package com.ubdt;

public class Computer {

	public static void main(String[] args) 
	{
		Laptop laptop=new Laptop();
		Computer computer=new Laptop();
		
		System.out.println(laptop.system);
		laptop.inform();
		
		Tablet tablet=new Tablet();
		Computer computer1=new Tablet();
		Laptop laptop1=new Tablet();
		
		System.out.println(tablet.name);
		tablet.scroll();
	}

}
