package com;

public class Guesthouse extends Hostel
{
	@Override
	public void protect() {
		System.out.println("invoking no argument in gusethouse");
		
	}
	@Override
	public void protect(int height) {
		System.out.println("invoking int in gusethouse");
	}
	@Override
	public void protect(int height, String name) {
		System.out.println("invoking int,string in guesthouse");
		
	}
	@Override
	public void protect(String location, double size) {
		System.out.println("invoking string,double in guesthouse");
		
	}
	@Override
	public void protect(String name) {
		System.out.println("ivokin string,doublegguesthouse in ");
		
	}
	@Override
	public void protect(String name, int noofstudents) {
		System.out.println("invoking string,int in guesthouse");
		
	}

}
