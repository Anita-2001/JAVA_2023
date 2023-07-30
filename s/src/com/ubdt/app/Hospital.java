package com.ubdt.app;

public class Hospital
{
	public String name="manipal";
	public String location="hassan";
	
	public Doctor doctor=new Doctor();
	
	public void guide()
	{
		if(this.doctor!=null)
		{
			System.out.println("invoking guide in welcome");
	    }
	   else
	    {
		System.out.println("invalid");
	     }
	}
	
	public void healthcare()
	{
		System.out.println("invoking healthcare in hospital ");
	}

	
}
