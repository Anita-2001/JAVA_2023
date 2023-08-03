package com.xworkz.boot;

import com.NationalZoo;
import com.StateZoo;
import com.xworkz.app.Zoo;

public class Zooutil 
{
	public static void preserve(Zoo zoo)
	{
		System.out.println(zoo.name);
		
		if(zoo instanceof StateZoo)
		{
			StateZoo zoo1=(StateZoo)zoo;
			System.out.println(zoo1.state);
			System.out.println(zoo1.size);
			System.out.println(zoo1.name);
			zoo1.shelter();
			zoo1.secure();
			zoo1.store();
			
			
		}
		
	}

}
