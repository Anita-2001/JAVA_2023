package com;

public class Hospital {
	public void treat() {
		System.out.println("invokinh no argument treat in hospital");
	}

	public void treat(String name) {
		System.out.println("invoking string in hospital");
	}

	public void treat(String name, int height) {
		System.out.println("invoking string int in hospital");
	}

	public void treat(String location, double distance) {
		System.out.println("invoking string int hospital");
	}
	public void treat(int noofnurse,int nooflifts)
	{
		System.out.println("invokimg int int in hospital");
	}
	public void treat(String name,String location)
	{
		System.out.println("invoking string string in hospital");
	}

}
