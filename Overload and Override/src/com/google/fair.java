package com.google;

import com.Market;

public class fair extends Market 
{
	@Override
	public void sell() {
		System.out.println("invoking no argument in gusethouse");
		
	}
	@Override
	public void sell(int height) {
		System.out.println("invoking int in gusethouse");
	}
	@Override
	public void sell(int height, String name) {
		System.out.println("invoking int,string in guesthouse");
		
	}
	@Override
	public void sell(String location, double size) {
		System.out.println("invoking string,double in guesthouse");
		
	}
	@Override
	public void sell(String name) {
		System.out.println("ivokin string,doublegguesthouse in ");
		
	}
	@Override
	public void sell(String name, int noofstudents) {
		System.out.println("invoking string,int in guesthouse");
		
	}

}


