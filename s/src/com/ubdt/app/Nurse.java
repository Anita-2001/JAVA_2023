package com.ubdt.app;

public class Nurse {
	
	public String place="agadi";
	public int exp=9;
	
	public Patient pat=new Patient();
	
	public void inform()
	{
		if(this.pat!=null)
		{
			System.out.println("print yes");
		}
	
	else
	{
		System.out.println("print no");
	}
	}
   
	public void protect()
	{
		System.out.println("invoking protect in nurse");
	}
}
