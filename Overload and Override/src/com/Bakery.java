package com;

public class Bakery 
{
	public void food()
	{
		System.out.println("invoking no argument in food method");
	}
	public void food(String name)
	{
		System.out.println("invoking string in food");
		System.out.println("name"+name);
	}
	public void food(String name,float cost)
	{
		System.out.println("invoking string,int in food");
		System.out.println("name"+name);
		System.out.println("cost"+cost);
	}
	public void food(String location,int noofitems)
	{
		System.out.println("invoking string,int in food");
		System.out.println("location:"+location);
		System.out.println("noofitems:"+noofitems);
	}
	public void food(int noofworkers,float height,int size)
	{
		System.out.println("inoking int,float,int in food");
		System.out.println("noofworkers:"+noofworkers);
		System.out.println("height;"+height);
		System.out.println("size:"+size);
	}
	public void food(String location,int additive,boolean edible)
	{
		System.out.println("invoking stringint,boolean in food");
		System.out.println("location"+location);
		System.out.println("additive:"+additive);
		System.out.println("edible:"+edible);
				
	    
	}

}
