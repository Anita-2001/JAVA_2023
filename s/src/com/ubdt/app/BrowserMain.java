package com.ubdt.app;

import com.Browser;
import com.Internet;

public class BrowserMain 
{
	public static void main(String[] args) 
	{
		Browser browser=new Browser();
		System.out.println("name:"+browser.name);
		 browser.search();
		browser.suggest();
		
	Internet ref=browser.internet;
	
		
	}

}
