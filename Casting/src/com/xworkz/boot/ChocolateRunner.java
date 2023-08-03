package com.xworkz.boot;
import com.xworkz.app.*;

public class ChocolateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chocolate darkChocolate=new DarkChocolate();
		ChocolateUtil.taste(darkChocolate);

		 CaramelChocolate chocolate=new CaramelChocolate();
		 ChocolateUtil.taste(chocolate);
	}

}
