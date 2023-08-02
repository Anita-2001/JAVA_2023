package com.ubdt;

public class Teacher 
{
	public String name;
	public int exp;
	
	public Teacher(String name, int exp)
	{
		this.name=name;
		this.exp=exp;
	}
     public void printInfo()
     {
    	 System.out.println(this.name);
    	 System.out.println(this.exp);
     }
}
