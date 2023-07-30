package com.ubdt;

public class Hotel 
{
	public String name="savita";
	public float cost=30f;
	
	public Cook cook=new Cook();
	public void provide()
	{
		if(this.cook!=null)
		{
			System.out.println("print yes");
		}
		else
		{
			System.out.println("print no");
		}
	}
    public void shelter()
    {
    	System.out.println("invoking shelter in hotel");
    }
}
