package com;

import com.ubdt.app.Shop;

public class ShopServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop ref=new Shop();
		System.out.println("Name:"+ref.name);
		System.out.println("location:"+ref.location);
		ref.service();
		ref.goods();
		
		
		
      
	}

}
