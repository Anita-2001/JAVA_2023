package com.google;

public class Temple {

	public void pray()
	{
		System.out.println("Invoking Temple no arg");
	}
	public void pray(String name)
	{
		System.out.println("Invoking Temple String");
	}
	public void pray(String name ,int duration)
	{
		System.out.println("Invoking Temple String,int");
	}
	public void pray(String name ,int duration,String location)
	{
		System.out.println("Invoking Temple String,int,String");
	}
	public void pray(String name ,int duration,String location,int height)
	{
		System.out.println("Invoking Temple String,int,String,int");
	}
	public void pray(String name ,int duration,String location,int height,int width)
	{
		System.out.println("Invoking Temple String,int,String,int,int");
	}
}
