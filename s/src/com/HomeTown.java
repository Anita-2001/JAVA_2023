package com;

public class HomeTown
{
	public String name;
	public int pinCode;
	public Area[] area;
	
	public HomeTown(String name,int pinCode,Area[] area)
	{
		this.name=name;
		this.pinCode=pinCode;
		this.area=area;
	}
	public void printInfo()
	{
		System.out.println("name is:"+name);
		System.out.println("pincode is:"+pinCode);
		for(int num=0;num<this.area.length;num++)
		{
			Area ref1=area[num];
			System.out.println(ref1);
		}
	}
	

}
