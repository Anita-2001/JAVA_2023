package com.ubdt.app;

import com.Clock;
import com.HourGlass;
import com.SmartWatch;
import com.Sun;
import com.Watch;

public class SunMain {

	public static void main(String[] args) 
	{

		
		SmartWatch smart=new SmartWatch();
		Watch watch=new SmartWatch();
		Clock clock=new SmartWatch();
		HourGlass glass=new SmartWatch();
		Sun sun=new SmartWatch();
		smart.bp();
		System.out.println(smart.brand);
		smart.heat();
		System.out.println(smart.intensity);
		
		Watch watch1=new Watch();
		Clock clock1=new Watch();
		HourGlass glass1=new Watch();
		Sun sun1=new Watch();
		
		watch1.time();
		System.out.println(watch1.cost);
		
		Clock clock2=new Clock();
		HourGlass glass2=new Clock();
		Sun sun2=new Clock();
		clock2.main();
		System.out.println(clock2.type);
		
		HourGlass glass3=new HourGlass();
		Sun sun4=new HourGlass();
		
		glass.Hour();
		System.out.println(glass.cost);

	}

}
