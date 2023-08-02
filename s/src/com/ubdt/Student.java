package com.ubdt;

public class Student 
{
	public int std;
	public String name;
	
	public Student(int std, String name)
	{
		this.std=std;
		this.name=name;
	}
	public void printInfo()
	{
		System.out.println(this.std);
		System.out.println(this.name);
	}

}
