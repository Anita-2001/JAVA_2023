package com.google;

import com.Pub;

public class Party extends Pub
{

	public void dance()
	{
		System.out.println("invoking dance in subclaa shop");
	}
	public void dance(String name)
	{
		System.out.println("invoking string in subclss shop");
		System.out.println("name:"+name);
	}
	@Override
	public void dance(int noofworkers, float height, int size) {
		System.out.println("invoking int,float,int in shop");
		System.out.println("nooworkers:"+noofworkers);
		System.out.println("height:"+height);
		System.out.println("size:"+size);
	
	}
	@Override
	public void dance(String location, int noofitems) {
		System.out.println("invoking string,int in dance");
		
	}
	@Override
	public void dance(String location, int additive, boolean edible) {
		System.out.println("invoking string,int,boolean in shop");
	}
	@Override
	public void dance(String name, float cost) {
		System.out.println("invoking string,float in shop");
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
	}
	

}
