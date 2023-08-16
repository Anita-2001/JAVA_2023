package com;

public abstract class Car {
	public abstract void gas();
	public abstract void brake();
	public abstract void speed();
	public abstract void accelerate();
	public abstract void handle();
	
	public void stop()
	{
		System.out.println("invoking stop in car");
	}
	public void move()
	{
		System.out.println("invoking move iin car");
	}
	public   void play()
	{
		System.out.println("invoking play in car");
	}
	public void carry()
	{
		System.out.println("invoking run in car");
	}
	public void park()
	{
		System.out.println("invoking park in car");
	}

}
