package com;

public class Floor
{
	public String name;
	public int no;
	
	public Floor(String name, int no)
	{
		this.name=name;
		this.no=no;
	}

	public void printInfo()
	{
		System.out.println("name is:"+name);
		System.out.println("no is:"+no);
	}
}
