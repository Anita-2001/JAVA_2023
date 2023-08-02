package com;

public class Lake {

	public static void main(String[] args) 
	{
		Bottle bottle=new Bottle();
		Tank tank=new Bottle();
		Sump sump=new Bottle();
		Lake lake=new Bottle();
       
		System.out.println(bottle.litres);
		bottle.store();
		
		Tank tank1=new Tank();
		Sump sump1=new Tank();
		Lake lake1=new Tank();
		
		System.out.println(tank.capacity);
		tank.main();
		
		Sump sump2=new Sump();
		Lake lake2=new Sump();
		sump2.providewater();
		System.out.println(sump2.height);
		
	
		}

}
