package com;

public class Honda extends Bike {
	
	void run()
	{
		System.out.println("invoking run in honda");
	}
	void travel()
	{
		System.out.println("invoking travel in honda");
	}
	void recreat()
	{
		System.out.println("invoking recreat in honda");
	}
	void brake()
	{
		System.out.println("invoking brake in honda");
	}
	void frame()
	{
		System.out.println("invoking frame in honda");
	}
	public void sport()
	{
		System.out.println("invoking sport in honda");
	}
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		super.accelerate();
	}
	@Override
	public void burns() {
		// TODO Auto-generated method stub
		super.burns();
	}
	@Override
	public void repair() {
		// TODO Auto-generated method stub
		super.repair();
	}
	@Override
	public void transport() {
		// TODO Auto-generated method stub
		super.transport();
	}
   
	

}
