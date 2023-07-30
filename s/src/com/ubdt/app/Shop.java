package com.ubdt.app;

import com.ubdt.app.web.*;

public class Shop
{
	public String name="Ambani";
	public String location="haveri";
	
	public SalesMan man=new SalesMan();

	public void service()
	{
		if(this.man!=null)
		{
			this.man.monitor();
		}
	   else
	    {
		System.out.println("invalid");
    	}
		}
		public void goods()
		{
			if(this.man!=null)
			{
				this.man.help();
				System.out.println("invoking goods in shop");
			}
			
		    
		  else
		{
			System.out.println("invoking goods in shop");
		}
}
}
