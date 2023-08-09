package com.google;

import com.Hotel;

public class Lodge extends Hotel
{
	public void serve()

	{
		System.out.println("invoking serve in lodge");
	}
	@Override
	public void serve(int noofrooms, String loaction) {
		System.out.println("invoking noofrooms,location in lodge");
		System.out.println("noofroms:"+noofrooms);
		System.out.println("loaction:"+loaction);
		super.serve(noofrooms, loaction);
	}
	@Override
	public void serve(int noofworkers, int cost) {
		System.out.println("invoking int,int in lodge");
		
	}
	@Override
	public void serve(String name, int cost) {
		System.out.println("invoking string int in lodge");
		
	}
	@Override
	public void serve(String name) {
		System.out.println("invoking string in ldge ");
		
	}
	@Override
	public void serve(String name, String loaction) {
		 System.out.println("invoking string,string in lodge");
	}
}
