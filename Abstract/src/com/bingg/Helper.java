package com.bingg;


/*similar to interface we can create statc methods in abstract class that can be called independently withot creating obj*/
public class Helper {
	
	static void demo()          /*abstract method*/
	{
		System.out.println("invoking demo in helper");
	}

	
	public static void main(String[] args)
	{
		demo();
	}
}
