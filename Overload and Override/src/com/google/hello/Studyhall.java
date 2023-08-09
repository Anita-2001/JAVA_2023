package com.google.hello;

import com.Library;

public class Studyhall extends Library
{
	@Override
	public void study() {
		System.out.println("invoking study in studyhall");
	}
	@Override
	public void study(int noofrooms, String loaction) {
	System.out.println("invoking study in studyhall");
	}
	@Override
	public void study(int noofworkers, int cost) {
		System.out.println("invoking int,int in studyhall");
		super.study(noofworkers, cost);
	}
	@Override
	public void study(String name) {
		System.out.println("invoking string in study hall");
				super.study(name);
	}
	@Override
	public void study(String name, int cost) {
		super.study(name, cost);
	}
	@Override
	public void study(String name, String loaction) {
		// TODO Auto-generated method stub
		super.study(name, loaction);
	}

}
