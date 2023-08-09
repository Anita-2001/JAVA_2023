package com.google;

import com.Street;

public class Area extends Street
{
	@Override
	public void shelter() {
		System.out.println("invoking no argument in street");
		
	}
	@Override
	public void shelter(int height) {
		System.out.println("invoking int in gusethouse");
	}
	@Override
	public void shelter(int height, String name) {
		System.out.println("invoking int,string in street");
		
	}
	@Override
	public void shelter(String location, double size) {
		System.out.println("invoking string,double in street");
		
	}
	@Override
	public void shelter(String name) {
		System.out.println("ivokin string,doublegstreet in ");
		
	}
	@Override
	public void shelter(String name, int noofstudents) {
		System.out.println("invoking string,int in street");
		
	}

}


