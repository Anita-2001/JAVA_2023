package com;

public class BrowserRunner {

	public static void main(String[] args) 
	{
		FireFox fox=new FireFox();
		Browserutil.find(fox);

		OperaBrowser opera=new OperaBrowser();
		Browserutil.find(opera);
	}

}
