package com;

import com.ubdt.app.web.PowerBank;

public class PowerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerBank bank=new PowerBank();
		System.out.println("capacity:"+bank.capacity);
        bank.recharge();
        bank.light();
	}

}
