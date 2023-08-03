package com;

public class Browserutil 
{
	public static void find(Browser browser)
	{
		System.out.println("invokin find in browserutil..");
		System.out.println(browser.size);
		
		if(browser instanceof FireFox)
		{
			FireFox fox=(FireFox)browser;
			System.out.println("invoking browse instance");
			System.out.println(fox.color);
		}
		
		if(browser instanceof OperaBrowser)
		{
			OperaBrowser opera=(OperaBrowser)browser;
			System.out.println(opera.os);
		}
		
		
	}
}
