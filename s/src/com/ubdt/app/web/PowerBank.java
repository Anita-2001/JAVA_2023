package com.ubdt.app.web;

import com.ubdt.Battery;

public class PowerBank {
	
	public int capacity=600;
	
	public Battery battery=new Battery();
	
	public void recharge()
	{
		if(this.battery!=null)
		{
			System.out.println("invoking recharge in battery");
		}
		else
		{
			System.out.println("error");
		}
	}
	public void light()
	{
		System.out.println("invoking light in powerbank");
	}

}
