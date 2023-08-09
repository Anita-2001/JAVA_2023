package com;

public class Pub 
{
	public void dance()
	{
		System.out.println("invoking no argument in dance method");
	}
	public void dance(String name)
	{
		System.out.println("invoking string in dance");
		System.out.println("name"+name);
	}
	public void dance(String name,float cost)
	{
		System.out.println("invoking string,int in dance");
		System.out.println("name"+name);
		System.out.println("cost"+cost);
	}
	public void dance(String location,int noofitems)
	{
		System.out.println("invoking string,int in dance");
		System.out.println("location:"+location);
		System.out.println("noofitems:"+noofitems);
	}
	public void dance(int noofworkers,float height,int size)
	{
		System.out.println("inoking int,float,int in dance");
		System.out.println("noofworkers:"+noofworkers);
		System.out.println("height;"+height);
		System.out.println("size:"+size);
	}
	public void dance(String location,int additive,boolean edible)
	{
		System.out.println("invoking stringint,boolean in dance");
		System.out.println("location"+location);
		System.out.println("additive:"+additive);
		System.out.println("edible:"+edible);
				
	    
	}

}



