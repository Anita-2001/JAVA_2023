package com;

public class Browser 
{ 
	public String name="chrome";
	public Internet internet=new Internet();
	
	public void search() 
	{
		if(this.name!=null)
		{
			System.out.println("print the statment is correct");
		}
		else
		{
			System.out.println("print no ");
		}
	}
	public void suggest()
	{
		
	}
	
}
