package com.ubdt.app;

import com.ubdt.Cook;
import com.ubdt.Hotel;

public class HotelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Hotel hotel=new Hotel();
       System.out.println("name:+hotel.name");
       System.out.println("cost:"+hotel.cost);
       hotel.provide();
       hotel.shelter();
       
       Cook ref=hotel.cook;
       System.out.println("name:"+ref.name);
       ref.serve();
       ref.cutting();
       
	}

}
