package com.xworkz.app;


public class ChocolateUtil {

	public static void taste(Chocolate chocolate)
	{
		System.out.println("Invoking chocolate Main");
		
		System.out.println(chocolate.name);
	
		
		
		if(chocolate instanceof DarkChocolate)
		{
			System.out.println("Invoking DarkChocolate main..");
			DarkChocolate darkChocolate=(DarkChocolate)chocolate;
			System.out.println(darkChocolate.cost);
			darkChocolate.sweet();
		}
		
		if(chocolate instanceof CaramelChocolate)
		{
			System.out.println("invoking caramelchocolate main...");
			CaramelChocolate caramel=(CaramelChocolate)chocolate;
			System.out.println(caramel.color);
			caramel.method();
			
		}
		
	}
}
