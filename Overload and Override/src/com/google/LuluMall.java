package com.google;

public class LuluMall extends Mall{

	public void show()
		{
			System.out.println("invoking food in subclaa show");
		}

	public void show(String name) {
		System.out.println("invoking string in subclss show");
		System.out.println("name:" + name);
	}

	@Override
	public void show(int noofworkers, float height, int size) {
		System.out.println("invoking int,float,int in show");
		System.out.println("nooworkers:" + noofworkers);
		System.out.println("height:" + height);
		System.out.println("size:" + size);

	}

	@Override
	public void show(String location, int noofitems) {
		System.out.println("invoking string,int in show");

	}

	@Override
	public void show(String location, int additive, boolean edible) {
		System.out.println("invoking string,int,boolean in show");
	}

	@Override
	public void show(String name, float cost) {
		System.out.println("invoking string,float in shop");
		System.out.println("name:" + name);
		System.out.println("cost:" + cost);
	}

}
