package com.ubdt.app;

import com.ubdt.Company;

public class CompanyMain {

	public static void main(String[] args)
	{
		String name="google";
		String ceo="sundar pichai";
		String originCountry="US";
		
		Company company=new Company(name,ceo,originCountry);
		company.printInfo();
		

	}

}
