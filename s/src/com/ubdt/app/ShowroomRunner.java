package com.ubdt.app;

import com.ubdt.MobileShowroom;
import com.ubdt.Showroom;
import com.ubdt.WatchShowroom;

public class ShowroomRunner {

	public static void main(String[] args) 
	{
		MobileShowroom mobile=new MobileShowroom();
		Showroom showroom=new MobileShowroom();
		
		System.out.println(mobile.location);
		mobile.sell();
        System.out.println(mobile.cost);
        mobile.repair();
        
        if(showroom instanceof MobileShowroom)
        {
        MobileShowroom mobile1=(MobileShowroom)showroom;
       System.out.println(mobile1.location);
       mobile1.sell();
       mobile1.repair();
        }

      
    	   
       
       
       
	
	}
}
