package com.ubdt;

public class Company 
{
	public String name;
	public String ceo;
	public String originCountry;
	
	public Company(String name,String ceo,String originCountry)
	{
		this.name=name;
		this.ceo=ceo;
		this.originCountry=originCountry;
	}
	public void printInfo()
	{
		System.out.println(this.name);
		System.out.println(this.ceo);
		System.out.println(this.originCountry);
	}
	
	@Override
	public String toString() {
		return "Company [name=" + name + ", ceo=" + ceo + ", originCountry=" + originCountry + "]";
	}

}
