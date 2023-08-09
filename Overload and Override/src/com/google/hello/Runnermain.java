
//methods overloaded first and in subclass ovrrided those methods these are the instnce using parent ref and same class ref

package com.google.hello;
import com.*;
import com.google.*;

public class Runnermain 
{
	public static void main(String[] args) 
	{
		Bakery bakery=new Bakery();
		bakery.food("venkatesh", 90);
		Shop shop=new Shop();
		shop.food(10, 78.9f, 37);
		
		Hotel hotel=new Lodge();
		hotel.serve(20, "rajajinagar");
		Lodge lodge=new Lodge();
		lodge.serve("fivestar", 1000);
		
		Hospital hospital=new Hospital();
		hospital.treat("sdm");
		Cleanic cleanic=new Cleanic();
		cleanic.treat("erokool", 39);
		
		Mall mall=new Mall();
		mall.show("zudio", 10);
		LuluMall lulu=new LuluMall();
		lulu.show(17, 79.9f, 38);
		
		City city=new City();
		city.live("Banglore", "Rajajinagar", 1228);
		Place place=new Place();
		place.live(null);
		
		Temple temple=new Temple();
		temple.pray();	
		ShivTemple shivTemple=new ShivTemple();
		shivTemple.pray("ShivaTemple");
		
		Museum ref=new Museum();
		ref.live("vishweshwarayya");
		Zoo ref1=new Museum();
		ref1.live("bannergahtta", "mysore");
		
		Hostel hostel=new Hostel();
		hostel.protect(67);
		Guesthouse house=new Guesthouse();
		house.protect("jmj");
		
		Library lib=new Studyhall();
		lib.study("ram");
		Studyhall hall=new Studyhall();
		hall.study();
		
		Pub pub=new Pub();
		pub.dance();
		Party party=new Party();
		party.dance("denver");
		
		jail ref3=new jail();
		ref3.protect(78);
		Policestation station=new Policestation();
		station.protect();
		
		Street street=new Area();
		street.shelter("vidhyanagar");
		Area area =new Area();
		area.shelter("dvg", 7);
		
		Market market=new Market();
		market.sell("cbt");
		fair ref5=new fair();
		ref5.sell("chikpete");
		
		
	}

}
