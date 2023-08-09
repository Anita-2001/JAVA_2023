package com.google;

import com.Bakery;

public class Shop extends Bakery
{
	public void food()
	{
		System.out.println("invoking food in subclaa shop");
	}
	public void food(String name)
	{
		System.out.println("invoking string in subclss shop");
		System.out.println("name:"+name);
	}
	@Override
	public void food(int noofworkers, float height, int size) {
		System.out.println("invoking int,float,int in shop");
		System.out.println("nooworkers:"+noofworkers);
		System.out.println("height:"+height);
		System.out.println("size:"+size);
	
	}
	@Override
	public void food(String location, int noofitems) {
		System.out.println("invoking string,int in food");
		
	}
	@Override
	public void food(String location, int additive, boolean edible) {
		System.out.println("invoking string,int,boolean in shop");
	}
	@Override
	public void food(String name, float cost) {
		System.out.println("invoking string,float in shop");
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
	}
	

}
