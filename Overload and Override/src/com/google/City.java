package com.google;

public class City {
	
	
	public void live()
	{
		System.out.println("Invoking live in place no arg");
	}
	public void live(String name)
	{
		System.out.println("Invoking live in place String ");
	}
	public void live(String name,String location)
	{
		System.out.println("Invoking live in place  String,String");
	}
	public void live(String name,String location,double area)
	{
		System.out.println("Invoking live in place String,String,double");
	}
	public void live(String name,String location,double area,double people)
	{
		System.out.println("Invoking live in place String,String,double,double");
	}
	public void live(String name,String location,double area,double people,int number)
	{
		System.out.println("Invoking live in place String,String,double,double,int");
	}
	
	

}
