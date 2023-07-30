package com.ubdt.app;

public class Doctor {
	public String name="ddd";
	public int age=49;
	
	public Nurse nurse=new Nurse();
	
	public void injection()
	{
		if(this.nurse!=null)
		{
		System.out.println("invoking injection in doctor");
		}
	   }
     	public void treat()
	  {
		System.out.println("invoking treat in doctor");
	  }
	
     	public void hearproblems()
     	{
     		System.out.println("invoking hearproblems in doctor");
     	}

}
