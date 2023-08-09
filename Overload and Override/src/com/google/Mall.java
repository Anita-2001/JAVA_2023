package com.google;

public class Mall {
	

	
		public void show()
		{
			System.out.println("invoking no argument in show method");
		}
		public void show(String name)
		{
			System.out.println("invoking string in show");
			System.out.println("name"+name);
		}
		public void show(String name,float cost)
		{
			System.out.println("invoking string,int in show");
			System.out.println("name"+name);
			System.out.println("cost"+cost);
		}
		public void show(String location,int noofitems)
		{
			System.out.println("invoking string,int in show");
			System.out.println("location:"+location);
			System.out.println("noofitems:"+noofitems);
		}
		public void show(int noofworkers,float height,int size)
		{
			System.out.println("inoking int,float,int in show");
			System.out.println("noofworkers:"+noofworkers);
			System.out.println("height;"+height);
			System.out.println("size:"+size);
		}
		public void show(String location,int additive,boolean edible)
		{
			System.out.println("invoking stringint,boolean in show");
			System.out.println("location"+location);
			System.out.println("additive:"+additive);
			System.out.println("edible:"+edible);
					
		    
		}

	}


