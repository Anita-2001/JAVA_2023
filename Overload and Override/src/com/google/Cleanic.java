package com.google;

import com.Hospital;

public class Cleanic extends Hospital
{
	@Override
	public void treat() {
		// TODO Auto-generated method stub
		super.treat();
	}
	@Override
	public void treat(int noofnurse, int nooflifts) {
		System.out.println("invoking int int in cleanic");
	}
	@Override
	public void treat(String name) {
		System.out.println("invoking string in cleanic");
	}
	@Override
	public void treat(String name, int height)
	{
		System.out.println("invoking string int in cleanic");
		
	}
	@Override
	public void treat(String location, double distance) {
		System.out.println("invoking string double in cleanic");
	}
	
	@Override
	public void treat(String name, String location) {
		System.out.println("invoking string string in cleanic");
	}

}
