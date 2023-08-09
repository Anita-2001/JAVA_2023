package com;

public class Hotel {

	public void serve()
	{
		System.out.println("invooking no argument serve in hotel");
	}
	public void serve(String name)
	{
		System.out.println("invoing string in hotel");
	}
	public void serve(String name,String loaction)
	{
		System.out.println("invoking string,string in hotel");
	}
	public void serve(int noofrooms,String loaction)
	{
		System.out.println("ivoking int string in hotel");
	}
	public void serve(int noofworkers,int cost)
	{
		System.out.println("invoking int,int in hotel");
		
	}
	public void serve(String name,int cost)
	{
		System.out.println("invoking string,int in hotel");
	}
}
